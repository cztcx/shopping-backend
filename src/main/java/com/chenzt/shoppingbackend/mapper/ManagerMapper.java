package com.chenzt.shoppingbackend.mapper;

import com.chenzt.shoppingbackend.entity.Manager;
import com.chenzt.shoppingbackend.entity.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    long countByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int deleteByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int insert(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int insertSelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    List<Manager> selectByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    Manager selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int updateByPrimaryKeySelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    int updateByPrimaryKey(Manager record);
}