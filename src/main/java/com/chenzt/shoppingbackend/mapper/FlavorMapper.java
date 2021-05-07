package com.chenzt.shoppingbackend.mapper;

import com.chenzt.shoppingbackend.entity.Flavor;
import com.chenzt.shoppingbackend.entity.FlavorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlavorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    long countByExample(FlavorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int deleteByExample(FlavorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int insert(Flavor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int insertSelective(Flavor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    List<Flavor> selectByExample(FlavorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    Flavor selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int updateByExampleSelective(@Param("record") Flavor record, @Param("example") FlavorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int updateByExample(@Param("record") Flavor record, @Param("example") FlavorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int updateByPrimaryKeySelective(Flavor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flavor
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    int updateByPrimaryKey(Flavor record);
}