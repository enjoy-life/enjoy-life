package com.enjoylife.common.model.poi.service;

import com.enjoylife.common.model.poi.District;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM5:06
 * To change this template use File | Settings | File Templates.
 */
public interface DistrictService {

    public String addDistrict(District district);

    public District loadDistrict(String districtId);

}
