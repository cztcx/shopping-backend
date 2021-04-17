package com.chenzt.shoppingbackend.entity;

import java.time.LocalDateTime;

public class Cart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.user_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.count
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private Double count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.ctime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private LocalDateTime ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.mtime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private LocalDateTime mtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.id
     *
     * @return the value of cart.id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.id
     *
     * @param id the value for cart.id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_id
     *
     * @return the value of cart.goods_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_id
     *
     * @param goodsId the value for cart.goods_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.user_id
     *
     * @return the value of cart.user_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.user_id
     *
     * @param userId the value for cart.user_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.count
     *
     * @return the value of cart.count
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public Double getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.count
     *
     * @param count the value for cart.count
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.ctime
     *
     * @return the value of cart.ctime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public LocalDateTime getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.ctime
     *
     * @param ctime the value for cart.ctime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.mtime
     *
     * @return the value of cart.mtime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public LocalDateTime getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.mtime
     *
     * @param mtime the value for cart.mtime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setMtime(LocalDateTime mtime) {
        this.mtime = mtime;
    }
}