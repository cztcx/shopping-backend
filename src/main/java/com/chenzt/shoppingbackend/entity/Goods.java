package com.chenzt.shoppingbackend.entity;

import java.time.LocalDateTime;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.count
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.status
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.introduction
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.category_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.ctime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private LocalDateTime ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.mtime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private LocalDateTime mtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.shop_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    private String shopId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.count
     *
     * @return the value of goods.count
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.count
     *
     * @param count the value for goods.count
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.status
     *
     * @return the value of goods.status
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.status
     *
     * @param status the value for goods.status
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.introduction
     *
     * @return the value of goods.introduction
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.introduction
     *
     * @param introduction the value for goods.introduction
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category_id
     *
     * @return the value of goods.category_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category_id
     *
     * @param categoryId the value for goods.category_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.ctime
     *
     * @return the value of goods.ctime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public LocalDateTime getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.ctime
     *
     * @param ctime the value for goods.ctime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.mtime
     *
     * @return the value of goods.mtime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public LocalDateTime getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.mtime
     *
     * @param mtime the value for goods.mtime
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setMtime(LocalDateTime mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.shop_id
     *
     * @return the value of goods.shop_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.shop_id
     *
     * @param shopId the value for goods.shop_id
     *
     * @mbg.generated Sun Apr 11 15:20:42 CST 2021
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}