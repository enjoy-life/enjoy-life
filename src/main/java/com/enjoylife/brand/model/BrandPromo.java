package com.enjoylife.brand.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-27
 * Time: PM7:10
 * To change this template use File | Settings | File Templates.
 */
public class BrandPromo implements Serializable {
    private static final long serialVersionUID = -6044799669137603785L;

    private String id;
    private String brandId;

    private String title;
    private String content;
    private Date beginTime;
    private Date endTime;

    private List<String> shopIds;

    private boolean effective; // 是否有效
    private Date addTime;
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public boolean getEffective() {
        return effective;
    }

    public void setEffective(boolean effective) {
        this.effective = effective;
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
