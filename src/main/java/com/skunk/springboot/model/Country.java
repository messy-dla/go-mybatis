package com.skunk.springboot.model;

public class Country {
    private Integer cId;
    private String cCountryname;
    private String cCapital;

    public Country(Integer cId, String cCountryname, String cCapital) {
        this.cId = cId;
        this.cCountryname = cCountryname;
        this.cCapital = cCapital;
    }

    public Country() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcCountryname() {
        return cCountryname;
    }

    public void setcCountryname(String cCountryname) {
        this.cCountryname = cCountryname == null ? null : cCountryname.trim();
    }

    public String getcCapital() {
        return cCapital;
    }

    public void setcCapital(String cCapital) {
        this.cCapital = cCapital == null ? null : cCapital.trim();
    }
}