package com.enjoylife.common.model.poi.service;

import com.enjoylife.common.model.poi.City;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM3:12
 * To change this template use File | Settings | File Templates.
 */
public interface CityService {

    public String addCity(City city);

    public City loadCity(String cityId);

}
