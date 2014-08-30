package com.enjoylife.common.model.poi.dao;

import com.enjoylife.common.db.mongo.CollectionName;
import com.enjoylife.common.db.mongo.GenericDao;
import com.enjoylife.common.model.poi.entity.DistrictEntity;
import org.jongo.Jongo;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM4:37
 * To change this template use File | Settings | File Templates.
 */
public class DistrictDao extends GenericDao<DistrictEntity> {

    public DistrictDao(Jongo jongo) {
        super(CollectionName.District, DistrictEntity.class, jongo);
    }

}
