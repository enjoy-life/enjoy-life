package com.enjoylife.brand.dao;

import com.enjoylife.brand.entity.BrandEntity;
import com.enjoylife.common.db.mongo.CollectionName;
import com.enjoylife.common.db.mongo.GenericDao;
import org.jongo.Jongo;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM10:13
 * To change this template use File | Settings | File Templates.
 */
public class BrandDao extends GenericDao<BrandEntity> {

    public BrandDao(Jongo jongo) {
        super(CollectionName.Brand, BrandEntity.class, jongo);
    }

}
