package com.myhotle.android.db;

public class TRuzhu{

    private Integer id;
    private Integer kefang_id;
    private String kehuming;
    private String kehuzheng;

    private String rushijian;
    private String lishijian;
    private Integer feiyong;

    private TKefang kefang;

    public Integer getFeiyong()
    {
        return feiyong;
    }
    public void setFeiyong(Integer feiyong)
    {
        this.feiyong = feiyong;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getKefang_id()
    {
        return kefang_id;
    }
    public void setKefang_id(Integer kefang_id)
    {
        this.kefang_id = kefang_id;
    }
    public String getKehuming()
    {
        return kehuming;
    }
    public void setKehuming(String kehuming)
    {
        this.kehuming = kehuming;
    }

    public TKefang getKefang()
    {
        return kefang;
    }
    public void setKefang(TKefang kefang)
    {
        this.kefang = kefang;
    }
    public String getKehuzheng()
    {
        return kehuzheng;
    }
    public void setKehuzheng(String kehuzheng)
    {
        this.kehuzheng = kehuzheng;
    }
    public String getLishijian()
    {
        return lishijian;
    }
    public void setLishijian(String lishijian)
    {
        this.lishijian = lishijian;
    }
    public String getRushijian()
    {
        return rushijian;
    }
    public void setRushijian(String rushijian)
    {
        this.rushijian = rushijian;
    }

}
