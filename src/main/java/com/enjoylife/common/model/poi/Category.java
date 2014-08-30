package com.enjoylife.common.model.poi;

import com.enjoylife.common.model.Model;


/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-28
 * Time: AM1:01
 * To change this template use File | Settings | File Templates.
 */
public class Category extends Model {
    private static final long serialVersionUID = -7523233822898660199L;

    private String name;
    private Integer dpCategoryId;

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
