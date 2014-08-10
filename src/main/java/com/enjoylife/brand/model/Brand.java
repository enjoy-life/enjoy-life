package com.enjoylife.brand.model;

import com.enjoylife.common.model.Image;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-26
 * Time: PM4:00
 * To change this template use File | Settings | File Templates.
 */
public class Brand implements Serializable {
    private static final long serialVersionUID = -2645850739446640435L;

    private String id;
    private String name;
    private Image logo;

    private Date addTime;
    private Date updateTime;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
