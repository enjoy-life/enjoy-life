package com.enjoylife.brand.service.Impl;

import com.enjoylife.brand.dao.BrandPromoDao;
import com.enjoylife.brand.entity.BrandPromoEntity;
import com.enjoylife.brand.model.Brand;
import com.enjoylife.brand.model.BrandPromo;
import com.enjoylife.brand.model.vo.BasicBrandPromo;
import com.enjoylife.brand.service.BrandPromoService;
import com.enjoylife.brand.service.BrandService;
import com.enjoylife.common.model.Page;
import com.enjoylife.common.utils.EntityAndModelConvertEachOtherUtils;
import com.enjoylife.common.utils.PageUtils;
import com.enjoylife.common.utils.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM11:35
 * To change this template use File | Settings | File Templates.
 */
public class BrandPromoServiceImpl implements BrandPromoService {

    private BrandPromoDao brandPromoDao;
    private BrandService brandService;

    @Override
    public Page<BasicBrandPromo> paginateBasicBrandPromos(String cityId, int pageNo, int pageSize) {
        if (StringUtils.isEmpty(cityId) || pageNo<=0 || pageNo<=0 )
            return null;
        Page<BrandPromoEntity> brandPromoEntityPage = brandPromoDao.paginate(pageNo, pageSize, "{cityId:#}", cityId);
        return convertToBasicBrandPromoPage(brandPromoEntityPage);
    }

    @Override
    public Page<BasicBrandPromo> paginateBasicBrandPromos(String cityId, String districtId, int pageNo, int pageSize) {
        if (StringUtils.isEmpty(cityId) || StringUtils.isEmpty(districtId) || pageNo<=0 || pageNo<=0 )
            return null;
        Page<BrandPromoEntity> brandPromoEntityPage = brandPromoDao.paginate(pageNo, pageSize, "{cityId:#, districtId:#}", cityId, districtId);
        return convertToBasicBrandPromoPage(brandPromoEntityPage);
    }

    @Override
    public String addBrandPromo(BrandPromo brandPromo) {
        if (brandPromo==null)
            return null;
        BrandPromoEntity brandPromoEntity = (BrandPromoEntity) EntityAndModelConvertEachOtherUtils.fromModelToEntity(brandPromo, BrandPromoEntity.class);
        Date now = new Date();
        brandPromoEntity.setAddTime(now);
        brandPromoEntity.setUpdateTime(now);
        brandPromoDao.save(brandPromoEntity);
        return brandPromoEntity.get_id().toString();
    }


    private Page<BasicBrandPromo> convertToBasicBrandPromoPage(Page<BrandPromoEntity> brandPromoEntityPage) {
        if (brandPromoEntityPage == null || CollectionUtils.isEmpty(brandPromoEntityPage.getRecords()))
            return null;
        int pageNo = brandPromoEntityPage.getPageNo();
        int pageSize = brandPromoEntityPage.getPageSize();
        List<BrandPromoEntity> brandPromoEntityList = brandPromoEntityPage.getRecords();
        List<BasicBrandPromo> basicBrandPromoList = convertToBasicBrandPromoList(brandPromoEntityList);
        Page result = PageUtils.convertToPage(pageNo, pageSize, basicBrandPromoList);
        return result;
    }

    private List<BasicBrandPromo> convertToBasicBrandPromoList(List<BrandPromoEntity> brandPromoEntityList) {
        if (CollectionUtils.isEmpty(brandPromoEntityList))
            return null;
        List<BasicBrandPromo> basicBrandPromoList_withoutBrandInfo =  EntityAndModelConvertEachOtherUtils.fromEntityToModel(brandPromoEntityList, BasicBrandPromo.class);
        List<BasicBrandPromo> basicBrandPromoList = enrichBrandInfo(basicBrandPromoList_withoutBrandInfo);
        return basicBrandPromoList;
    }

    private List<BasicBrandPromo> enrichBrandInfo(List<BasicBrandPromo> basicBrandPromoList_withoutBrandInfo) {
        if (CollectionUtils.isEmpty(basicBrandPromoList_withoutBrandInfo))
            return null;
        List<String> brandIds = new ArrayList<String>();
        for (BasicBrandPromo basicBrandPromo : basicBrandPromoList_withoutBrandInfo) {
            brandIds.add(basicBrandPromo.getBrandId());
        }
        List<Brand> brands = brandService.getBrands(brandIds);
        if (CollectionUtils.isEmpty(brands))
            return null;
        Map<String, Brand> brandMap = new HashMap<String, Brand>();
        for (Brand brand : brands) {
            brandMap.put(brand.getId(), brand);
        }
        List<BasicBrandPromo> basicBrandPromoList = new ArrayList<BasicBrandPromo>();
        for (BasicBrandPromo basicBrandPromo : basicBrandPromoList_withoutBrandInfo) {
            Brand brand = brandMap.get(basicBrandPromo.getBrandId());
            if (brand!=null) {
                basicBrandPromo.setBrand(brand);
                basicBrandPromoList.add(basicBrandPromo);
            }
        }
        return basicBrandPromoList;
    }



    public void setBrandPromoDao(BrandPromoDao brandPromoDao) {
        this.brandPromoDao = brandPromoDao;
    }

    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }
}
