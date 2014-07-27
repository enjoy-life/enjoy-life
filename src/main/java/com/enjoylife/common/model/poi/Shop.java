package com.enjoylife.common.model.poi;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-28
 * Time: AM12:28
 * To change this template use File | Settings | File Templates.
 */
public class Shop implements Serializable {
    private static final long serialVersionUID = -787124236037269037L;

    private String id;
    private String shopName;
    private String branchName;
    private String address;

    private String cityId;
    private String shopTypeId;
    private String districtId;

    private Integer dpShopId;
    private Integer dpShopTypeId;
    private Integer dpCityId;
    private Integer dpDistrictId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDpShopId() {
        return dpShopId;
    }

    public void setDpShopId(Integer dpShopId) {
        this.dpShopId = dpShopId;
    }


    public Integer getDpCityId() {
        return dpCityId;
    }

    public void setDpCityId(Integer dpCityId) {
        this.dpCityId = dpCityId;
    }

    public Integer getDpDistrictId() {
        return dpDistrictId;
    }

    public void setDpDistrictId(Integer dpDistrictId) {
        this.dpDistrictId = dpDistrictId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }


    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getShopTypeId() {
        return shopTypeId;
    }

    public void setShopTypeId(String shopTypeId) {
        this.shopTypeId = shopTypeId;
    }

    public Integer getDpShopTypeId() {
        return dpShopTypeId;
    }

    public void setDpShopTypeId(Integer dpShopTypeId) {
        this.dpShopTypeId = dpShopTypeId;
    }
}
