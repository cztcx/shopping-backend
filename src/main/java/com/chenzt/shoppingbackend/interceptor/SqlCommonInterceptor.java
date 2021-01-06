package com.chenzt.shoppingbackend.interceptor;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Properties;

@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})
})
public class SqlCommonInterceptor implements Interceptor {

    private Logger log = LoggerFactory.getLogger(SqlCommonInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        MappedStatement ms = (MappedStatement) invocation.getArgs()[0];
        SqlCommandType commandType = ms.getSqlCommandType();

        final String methodName = invocation.getMethod().getName();
        if ("update".equals(methodName)) {

            final Object parameter = invocation.getArgs()[1];

            if (parameter != null) {
                if (parameter instanceof Map) {
                    LocalDateTime now = LocalDateTime.now();
                    final Map<String, Object> map = (Map<String, Object>) parameter;
                    try {

                        Object record = map.get("record");
                        Class<?> clazz = record.getClass();
                        if (commandType.equals(SqlCommandType.INSERT)) {
                            final Method setCtime = clazz.getMethod("setCtime", String.class);
                            setCtime.invoke(record, now);
                        }
                        final Method setMtime = clazz.getMethod("setMtime", String.class);
                        setMtime.invoke(record, now);
                    } catch (Exception e) {
                    }
                    map.put("setCtime", now);
                } else {
                    try {
                        final Class<?> clazz = parameter.getClass();
                        LocalDateTime now = LocalDateTime.now();
                        try {
                            if (commandType.equals(SqlCommandType.INSERT)) {
                                final Method setCtime = clazz.getMethod("setCtime", LocalDateTime.class);
                                setCtime.invoke(parameter, now);
                            }
                            final Method setMtime = clazz.getMethod("setMtime", LocalDateTime.class);
                            setMtime.invoke(parameter, now);
                        } catch (NoSuchMethodException e) {
                        }
                    } catch (Exception ex) {
                    }
                }
            }
        }

        long startTime = System.currentTimeMillis();
        try {
            return invocation.proceed();
        } finally {
            long endTime = System.currentTimeMillis();
            long sqlCost = endTime - startTime;
            log.debug("Sql execute time --- [" + sqlCost + "ms]");
        }

    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}
