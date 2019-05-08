package com.myhotle.android.db;

public class TKefang {
    private Integer id;
    private String fangjianhao;
    private String area;
    private String jieshao;
    private String fujian;
    private Integer qianshu;
    private Integer catelogId;
    private String yudingtiaojian;
    private String del;

    private TCatelog catelog;

    // Constructors

    /** default constructor */
    public TKefang()
    {
    }

    /** full constructor */
    public TKefang(String fangjianhao, String area, String jieshao,
                   String fujian, Integer qianshu, Integer catelogId,
                   String yudingtiaojian, String del)
    {
        this.fangjianhao = fangjianhao;
        this.area = area;
        this.jieshao = jieshao;
        this.fujian = fujian;
        this.qianshu = qianshu;
        this.catelogId = catelogId;
        this.yudingtiaojian = yudingtiaojian;
        this.del = del;
    }

    // Property accessors

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public TCatelog getCatelog()
    {
        return catelog;
    }

    public void setCatelog(TCatelog catelog)
    {
        this.catelog = catelog;
    }

    public String getFangjianhao()
    {
        return this.fangjianhao;
    }

    public void setFangjianhao(String fangjianhao)
    {
        this.fangjianhao = fangjianhao;
    }

    public String getArea()
    {
        return this.area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public String getJieshao()
    {
        return this.jieshao;
    }

    public void setJieshao(String jieshao)
    {
        this.jieshao = jieshao;
    }

    public String getFujian()
    {
        return this.fujian;
    }

    public void setFujian(String fujian)
    {
        this.fujian = fujian;
    }

    public Integer getQianshu()
    {
        return this.qianshu;
    }

    public void setQianshu(Integer qianshu)
    {
        this.qianshu = qianshu;
    }

    public Integer getCatelogId()
    {
        return this.catelogId;
    }

    public void setCatelogId(Integer catelogId)
    {
        this.catelogId = catelogId;
    }

    public String getYudingtiaojian()
    {
        return this.yudingtiaojian;
    }

    public void setYudingtiaojian(String yudingtiaojian)
    {
        this.yudingtiaojian = yudingtiaojian;
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

