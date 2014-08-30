package com.enjoylife.brand.dao;

import com.enjoylife.brand.entity.BrandPromoEntity;
import com.enjoylife.common.db.mongo.CollectionName;
import com.enjoylife.common.db.mongo.GenericDao;
import org.jongo.Jongo;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM10:30
 * To change this template use File | Settings | File Templates.
 */
public class BrandPromoDao extends GenericDao<BrandPromoEntity> {

    public BrandPromoDao(Jongo jongo) {
        super(CollectionName.BrandPromo, BrandPromoEntity.class, jongo);
    }

}
