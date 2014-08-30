package com.enjoylife.common.model.poi.service.Impl;

import com.enjoylife.common.model.poi.City;
import com.enjoylife.common.model.poi.dao.CityDao;
import com.enjoylife.common.model.poi.entity.CityEntity;
import com.enjoylife.common.model.poi.service.CityService;
import com.enjoylife.common.utils.EntityAndModelConvertEachOtherUtils;
import com.enjoylife.common.utils.StringUtils;
import org.bson.types.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM3:37
 * To change this template use File | Settings | File Templates.
 */
public class CityServiceImpl implements CityService {

    private CityDao cityDao;

    @Override
    public String addCity(City city) {
        if (city==null)
            return null;
        CityEntity cityEntity = (CityEntity) EntityAndModelConvertEachOtherUtils.fromModelToEntity(city, CityEntity.class);
        cityDao.save(cityEntity);
        return cityEntity.get_id().toString();
    }

    @Override
    public City loadCity(String cityId) {
        if (StringUtils.isEmpty(cityId))
            return null;
        ObjectId objectId = new ObjectId(cityId);
        CityEntity cityEntity = cityDao.findOne("{_id:#}", objectId);
        return (City) EntityAndModelConvertEachOtherUtils.fromEntityToModel(cityEntity, City.class);
    }

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }
}
