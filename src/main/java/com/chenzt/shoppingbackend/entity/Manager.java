package com.chenzt.shoppingbackend.entity;

import java.time.LocalDateTime;

public class Manager {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.name
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.password
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.ctime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private LocalDateTime ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.mtime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private LocalDateTime mtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager.nickname
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    private String nickname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.id
     *
     * @return the value of manager.id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.id
     *
     * @param id the value for manager.id
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.name
     *
     * @return the value of manager.name
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.name
     *
     * @param name the value for manager.name
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.password
     *
     * @return the value of manager.password
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.password
     *
     * @param password the value for manager.password
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.ctime
     *
     * @return the value of manager.ctime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public LocalDateTime getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.ctime
     *
     * @param ctime the value for manager.ctime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.mtime
     *
     * @return the value of manager.mtime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public LocalDateTime getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.mtime
     *
     * @param mtime the value for manager.mtime
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setMtime(LocalDateTime mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.nickname
     *
     * @return the value of manager.nickname
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.nickname
     *
     * @param nickname the value for manager.nickname
     *
     * @mbg.generated Fri May 07 18:06:44 CST 2021
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}