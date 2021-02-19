package com.chenzt.shoppingbackend.entity;

import java.time.LocalDateTime;

public class Shop {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.name
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.status
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.address
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.user_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.manager_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String managerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.category_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.describe
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private String describe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.ctime
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private LocalDateTime ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.mtime
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    private LocalDateTime mtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.id
     *
     * @return the value of shop.id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.id
     *
     * @param id the value for shop.id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.name
     *
     * @return the value of shop.name
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.name
     *
     * @param name the value for shop.name
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.status
     *
     * @return the value of shop.status
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.status
     *
     * @param status the value for shop.status
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.address
     *
     * @return the value of shop.address
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.address
     *
     * @param address the value for shop.address
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.user_id
     *
     * @return the value of shop.user_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.user_id
     *
     * @param userId the value for shop.user_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.manager_id
     *
     * @return the value of shop.manager_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.manager_id
     *
     * @param managerId the value for shop.manager_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.category_id
     *
     * @return the value of shop.category_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.category_id
     *
     * @param categoryId the value for shop.category_id
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.describe
     *
     * @return the value of shop.describe
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.describe
     *
     * @param describe the value for shop.describe
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.ctime
     *
     * @return the value of shop.ctime
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public LocalDateTime getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.ctime
     *
     * @param ctime the value for shop.ctime
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.mtime
     *
     * @return the value of shop.mtime
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public LocalDateTime getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.mtime
     *
     * @param mtime the value for shop.mtime
     *
     * @mbg.generated Fri Feb 19 11:25:46 CST 2021
     */
    public void setMtime(LocalDateTime mtime) {
        this.mtime = mtime;
    }
}