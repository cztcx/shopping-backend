package com.chenzt.shoppingbackend.exception;


import com.chenzt.shoppingbackend.model.UnitError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 异常处理共通类
 *
 * @author chenzt
 */
@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    /**
     * 400 : Handle bad request exception
     */
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<UnitError> unitErrors = e.getBindingResult().getFieldErrors().stream().map(fieldError ->
                new UnitError(fieldError.getField(), fieldError.getDefaultMessage())
        ).collect(Collectors.toList());
        return new ResponseEntity<>(unitErrors, HttpStatus.BAD_REQUEST);
    }

    /**
     * 400 : Handle bad request exception
     */
    protected ResponseEntity<Object> handleMissingServletRequestPart(MissingServletRequestPartException e, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return ResponseEntity.badRequest().body(new UnitError(e.getRequestPartName(), e.getMessage()));
    }

    /**
     * 400 : Handle bad request exception
     */
    protected ResponseEntity<Object> handleBindException(BindException e, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<UnitError> unitErrors = e.getBindingResult().getFieldErrors().stream().map(fieldError ->
                new UnitError(fieldError.getField(), fieldError.getDefaultMessage())
        ).collect(Collectors.toList());
        return new ResponseEntity<>(unitErrors, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(new UnitError(null, "日期类型转换出错。"), HttpStatus.BAD_REQUEST);
    }

    /**
     * 404 : Handle not found exception
     */
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException e) {
        return new ResponseEntity<>("nodata", HttpStatus.OK);
    }


//    /**
//     * 403 : Handle token exception
//     */
//    @ExceptionHandler(JWTVerificationException.class)
//    public ResponseEntity<Map> handleTokenException(JWTVerificationException e) {
//        Map errMessage = new HashMap();
//        errMessage.put("errMessage", e.getMessage());
//        return new ResponseEntity<>(errMessage, HttpStatus.FORBIDDEN);
//    }
//
//    /**
//     * 406 : Handle application exception
//     */
//    @ExceptionHandler(ApplicationException.class)
//    public ResponseEntity<Map> handleApplicationException(ApplicationException e) {
//        Map errMessage = new HashMap();
//        errMessage.put("errMessage", e.getMessage());
//        return new ResponseEntity<>(errMessage, HttpStatus.NOT_ACCEPTABLE);
//    }

    /**
     * 500 : Handle exception
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<UnitError> handleException(Exception e) {
        logger.error(e.getMessage());
        return new ResponseEntity<>(new UnitError(null, "System error."), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
