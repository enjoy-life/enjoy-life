package com.enjoylife.brand.service.Impl;

import com.enjoylife.brand.dao.BrandDao;
import com.enjoylife.brand.entity.BrandEntity;
import com.enjoylife.brand.model.Brand;
import com.enjoylife.brand.service.BrandService;
import com.enjoylife.common.utils.EntityAndModelConvertEachOtherUtils;
import com.enjoylife.common.utils.ObjectIdUtils;
import com.enjoylife.common.utils.StringUtils;
import org.bson.types.ObjectId;
import org.springframework.util.CollectionUtils;

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
        return (Brand) EntityAndModelConvertEachOtherUtils.fromEntityToModel(brandEntity, Brand.class);
    }

    @Override
    public List<Brand> getBrands(List<String> brandIds) {
        if (CollectionUtils.isEmpty(brandIds))
            return null;
        List<ObjectId> objectIds = ObjectIdUtils.convertToObjectIds(brandIds);
        List<BrandEntity> brandEntityList = brandDao.find("{_id:{$in:#}}", objectIds);
        return EntityAndModelConvertEachOtherUtils.fromEntityToModel(brandEntityList, Brand.class);
    }

    @Override
    public String addBrand(Brand brand) {
        if (brand==null)
            return null;
        BrandEntity brandEntity = (BrandEntity) EntityAndModelConvertEachOtherUtils.fromModelToEntity(brand, BrandEntity.class);
        brandDao.save(brandEntity);
        return brandEntity.get_id().toString();
    }

    public void setBrandDao(BrandDao brandDao) {
        this.brandDao = brandDao;
    }
}
