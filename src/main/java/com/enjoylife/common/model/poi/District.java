package com.enjoylife.common.model.poi;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-28
 * Time: AM12:57
 * To change this template use File | Settings | File Templates.
 */
public class District implements Serializable {
    private static final long serialVersionUID = -5714235128797217707L;

    private String id;
    private String name;
    private Integer dpDistrictId;

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

    public Integer getDpDistrictId() {
        return dpDistrictId;
    }

    public void setDpDistrictId(Integer dpDistrictId) {
        this.dpDistrictId = dpDistrictId;
    }
}
