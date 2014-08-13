package com.enjoylife.brand.model.vo;

import com.enjoylife.brand.model.Brand;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM11:04
 * To change this template use File | Settings | File Templates.
 */
public class BasicBrandPromo implements Serializable {
    private static final long serialVersionUID = 3341320922866700584L;


    private String id;
    private String title;
    private Date beginTime;
    private Date endTime;
    private Brand brand;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
