package com.chenzt.shoppingbackend.entity;

import java.time.LocalDateTime;

public class ApproveHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_history.id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_history.shop_id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_history.user_id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_history.ctime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private LocalDateTime ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_history.mtime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private LocalDateTime mtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_history.id
     *
     * @return the value of approve_history.id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_history.id
     *
     * @param id the value for approve_history.id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_history.shop_id
     *
     * @return the value of approve_history.shop_id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_history.shop_id
     *
     * @param shopId the value for approve_history.shop_id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_history.user_id
     *
     * @return the value of approve_history.user_id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_history.user_id
     *
     * @param userId the value for approve_history.user_id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_history.ctime
     *
     * @return the value of approve_history.ctime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public LocalDateTime getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_history.ctime
     *
     * @param ctime the value for approve_history.ctime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_history.mtime
     *
     * @return the value of approve_history.mtime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public LocalDateTime getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_history.mtime
     *
     * @param mtime the value for approve_history.mtime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setMtime(LocalDateTime mtime) {
        this.mtime = mtime;
    }
}