package com.enjoylife.common.model.poi;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-28
 * Time: AM12:52
 * To change this template use File | Settings | File Templates.
 */
public class City implements Serializable {
    private static final long serialVersionUID = -197594417945103222L;

    private String id;
    private String name;
    private Integer dpCityId;

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

    public Integer getDpCityId() {
        return dpCityId;
    }

    public void setDpCityId(Integer dpCityId) {
        this.dpCityId = dpCityId;
    }
}
