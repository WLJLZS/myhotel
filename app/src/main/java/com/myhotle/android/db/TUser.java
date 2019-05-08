package com.myhotle.android.db;

public class TUser{
    private Integer userId;
    private String username;
    private String password;
    private String name;
    private String userAddress;
    private String userSex;
    private String userTel;
    private String userEmail;

    private String userQq;
    private String fujian;
    private String userType;
    private String userDel;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserAddress()
    {
        return userAddress;
    }
    public void setUserAddress(String userAddress)
    {
        this.userAddress = userAddress;
    }
    public String getUserDel()
    {
        return userDel;
    }
    public void setUserDel(String userDel)
    {
        this.userDel = userDel;
    }
    public String getUserEmail()
    {
        return userEmail;
    }
    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getFujian()
    {
        return fujian;
    }
    public void setFujian(String fujian)
    {
        this.fujian = fujian;
    }


    public String getUserType()
    {
        return userType;
    }
    public void setUserType(String userType)
    {
        this.userType = userType;
    }


    public String getUserQq()
    {
        return userQq;
    }
    public void setUserQq(String userQq)
    {
        this.userQq = userQq;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserSex()
    {
        return userSex;
    }
    public void setUserSex(String userSex)
    {
        this.userSex = userSex;
    }
    public String getUserTel()
    {
        return userTel;
    }
    public void setUserTel(String userTel)
    {
        this.userTel = userTel;
    }

}
