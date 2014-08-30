package com.enjoylife.common.model.poi.dao;

import com.enjoylife.common.db.mongo.CollectionName;
import com.enjoylife.common.db.mongo.GenericDao;
import com.enjoylife.common.model.poi.entity.CityEntity;
import org.jongo.Jongo;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM3:38
 * To change this template use File | Settings | File Templates.
 */
public class CityDao extends GenericDao<CityEntity> {

    public CityDao(Jongo jongo) {
        super(CollectionName.City, CityEntity.class, jongo);
    }

}
