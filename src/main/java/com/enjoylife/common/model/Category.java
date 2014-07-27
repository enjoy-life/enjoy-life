package com.enjoylife.common.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-28
 * Time: AM1:01
 * To change this template use File | Settings | File Templates.
 */
public class Category implements Serializable {
    private static final long serialVersionUID = -7523233822898660199L;

    private String id;
    private String name;
    private Integer dpCategoryId;

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

    public Integer getDpCategoryId() {
        return dpCategoryId;
    }

    public void setDpCategoryId(Integer dpCategoryId) {
        this.dpCategoryId = dpCategoryId;
    }
}
