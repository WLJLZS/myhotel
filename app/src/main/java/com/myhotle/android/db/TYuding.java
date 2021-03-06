package com.myhotle.android.db;

public class TYuding{

    private Integer id;
    private Integer userId;
    private Integer kefangId;
    private Integer tianshu;
    private String yudingzheTel;
    private String shijian;
    private String del;
    private TUser user;
    private TKefang kefang;

    public TYuding(){
    }
    public TYuding(Integer userId, Integer kefangId, Integer tianshu,
                   String yudingzheTel, String del)
    {
        this.userId = userId;
        this.kefangId = kefangId;
        this.tianshu = tianshu;
        this.yudingzheTel = yudingzheTel;
        this.del = del;
    }

    public Integer getId()
    {
        return this.id;
    }

    public TKefang getKefang()
    {
        return kefang;
    }

    public void setKefang(TKefang kefang)
    {
        this.kefang = kefang;
    }

    public TUser getUser()
    {
        return user;
    }

    public void setUser(TUser user)
    {
        this.user = user;
    }

    public String getShijian()
    {
        return shijian;
    }

    public void setShijian(String shijian)
    {
        this.shijian = shijian;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getUserId()
    {
        return this.userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public Integer getKefangId()
    {
        return this.kefangId;
    }

    public void setKefangId(Integer kefangId)
    {
        this.kefangId = kefangId;
    }

    public Integer getTianshu()
    {
        return this.tianshu;
    }

    public void setTianshu(Integer tianshu)
    {
        this.tianshu = tianshu;
    }

    public String getYudingzheTel()
    {
        return this.yudingzheTel;
    }

    public void setYudingzheTel(String yudingzheTel)
    {
        this.yudingzheTel = yudingzheTel;
    }

    public String getDel()
    {
        return this.del;
    }

    public void setDel(String del)
    {
        this.del = del;
    }

}
