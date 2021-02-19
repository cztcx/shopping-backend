package com.chenzt.shoppingbackend.mapper;

import com.chenzt.shoppingbackend.entity.Img;
import com.chenzt.shoppingbackend.entity.ImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    long countByExample(ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int deleteByExample(ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int insert(Img record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int insertSelective(Img record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    List<Img> selectByExample(ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    Img selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int updateByExampleSelective(@Param("record") Img record, @Param("example") ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int updateByExample(@Param("record") Img record, @Param("example") ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int updateByPrimaryKeySelective(Img record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    int updateByPrimaryKey(Img record);
}