package com.enjoylife.common.model.poi.service.Impl;

import com.enjoylife.common.model.poi.District;
import com.enjoylife.common.model.poi.dao.DistrictDao;
import com.enjoylife.common.model.poi.entity.DistrictEntity;
import com.enjoylife.common.model.poi.service.DistrictService;
import com.enjoylife.common.utils.EntityAndModelConvertEachOtherUtils;
import com.enjoylife.common.utils.StringUtils;
import org.bson.types.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM5:05
 * To change this template use File | Settings | File Templates.
 */
public class DistrictServiceImpl implements DistrictService {

    private DistrictDao districtDao;

    @Override
    public String addDistrict(District district) {
        if (district==null)
            return null;
        DistrictEntity districtEntity = (DistrictEntity) EntityAndModelConvertEachOtherUtils.fromModelToEntity(district, DistrictEntity.class);
        districtDao.save(districtEntity);
        return districtEntity.get_id().toString();
    }

    @Override
    public District loadDistrict(String districtId) {
        if (StringUtils.isEmpty(districtId))
            return null;
        ObjectId objectId = new ObjectId(districtId);
        DistrictEntity districtEntity = districtDao.findOne("{_id:#}", objectId);
        return (District) EntityAndModelConvertEachOtherUtils.fromEntityToModel(districtEntity, District.class);
    }

    public void setDistrictDao(DistrictDao districtDao) {
        this.districtDao = districtDao;
    }
}
