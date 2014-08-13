package com.enjoylife.brand.service.Impl;

import com.enjoylife.brand.dao.BrandPromoDao;
import com.enjoylife.brand.entity.BrandPromoEntity;
import com.enjoylife.brand.model.vo.BasicBrandPromo;
import com.enjoylife.brand.service.BrandPromoService;
import com.enjoylife.common.model.Page;
import com.enjoylife.common.utils.EntityAndModelConvertEachOtherUtil;
import com.enjoylife.common.utils.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM11:35
 * To change this template use File | Settings | File Templates.
 */
public class BrandPromoServiceImpl implements BrandPromoService {

    private BrandPromoDao brandPromoDao;

    @Override
    public Page<BasicBrandPromo> paginateBasicBrandPromos(String cityId, int pageNo, int pageSize) {
        if (StringUtils.isEmpty(cityId) || pageNo<=0 || pageNo<=0 )
            return null;

        Page<BrandPromoEntity> brandPromoEntityPage = brandPromoDao.paginate(pageNo, pageSize, "{cityId:#}", cityId);
        if (brandPromoEntityPage == null || CollectionUtils.isEmpty(brandPromoEntityPage.getRecords()))
            return null;

        List<BrandPromoEntity> brandPromoEntityList = brandPromoEntityPage.getRecords();
        List<BasicBrandPromo> basicBrandPromoList =  EntityAndModelConvertEachOtherUtil.fromEntityToModel(brandPromoEntityList, BasicBrandPromo.class);
        List<String> brandIds = new ArrayList<String>();
        for (BasicBrandPromo basicBrandPromo : basicBrandPromoList) {
            brandIds.add(basicBrandPromo.getId());
        }

        return null;
    }

    @Override
    public Page<BasicBrandPromo> paginateBasicBrandPromos(String cityId, String districtId, int pageNo, int pageSize) {
        if (StringUtils.isEmpty(cityId) || StringUtils.isEmpty(districtId) || pageNo<=0 || pageNo<=0 )
            return null;


        return null;
    }

    public void setBrandPromoDao(BrandPromoDao brandPromoDao) {
        this.brandPromoDao = brandPromoDao;
    }
}
