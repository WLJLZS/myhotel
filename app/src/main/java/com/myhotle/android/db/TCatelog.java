package com.myhotle.android.db;

public class TCatelog{

    private Integer catelogId;
    private String catelogName;
    private String catelogDel;

    public String getCatelogDel()
    {
        return catelogDel;
    }
    public void setCatelogDel(String catelogDel)
    {
        this.catelogDel = catelogDel;
    }
    public Integer getCatelogId()
    {
        return catelogId;
    }
    public void setCatelogId(Integer catelogId)
    {
        this.catelogId = catelogId;
    }
    public String getCatelogName()
    {
        return catelogName;
    }
    public void setCatelogName(String catelogName)
    {
        this.catelogName = catelogName;
    }

}
