package com.enjoylife.brand.service.Impl;

import com.enjoylife.brand.dao.BrandDao;
import com.enjoylife.brand.entity.BrandEntity;
import com.enjoylife.brand.model.Brand;
import com.enjoylife.brand.service.BrandService;
import com.enjoylife.common.utils.EntityAndModelConvertEachOtherUtil;
import com.enjoylife.common.utils.ObjectIdUtils;
import com.enjoylife.common.utils.StringUtils;
import org.bson.types.ObjectId;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: PM6:13
 * To change this template use File | Settings | File Templates.
 */
public class BrandServiceImpl implements BrandService {

    private BrandDao brandDao;

    @Override
    public Brand loadBrand(String brandId) {
        if (StringUtils.isEmpty(brandId))
            return null;
        ObjectId objectId = new ObjectId(brandId);
        BrandEntity brandEntity = brandDao.findOne("{_id:#}", objectId);
        return (Brand) EntityAndModelConvertEachOtherUtil.fromEntityToModel(brandEntity, Brand.class);
    }

    @Override
    public List<Brand> getBrands(List<String> brandIds) {
        if (CollectionUtils.isEmpty(brandIds))
            return null;
        List<ObjectId> objectIds = ObjectIdUtils.convertToObjectIds(brandIds);
        List<BrandEntity> brandEntityList = brandDao.find("{_id:{$in:#}}", objectIds);
        return EntityAndModelConvertEachOtherUtil.fromEntityToModel(brandEntityList, Brand.class);
    }

    @Override
    public void addBrand(Brand brand) {
        if (brand==null)
            return;
        BrandEntity brandEntity = (BrandEntity) EntityAndModelConvertEachOtherUtil.fromModelToEntity(brand, BrandEntity.class);
        brandDao.save(brandEntity);
    }

    public void setBrandDao(BrandDao brandDao) {
        this.brandDao = brandDao;
    }
}
