package com.enjoylife.brand.service;

import com.enjoylife.brand.model.BrandPromo;
import com.enjoylife.brand.model.vo.BasicBrandPromo;
import com.enjoylife.common.model.Page;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM11:08
 * To change this template use File | Settings | File Templates.
 */
public interface BrandPromoService {

    public Page<BasicBrandPromo> paginateBasicBrandPromos(String cityId, int pageNo, int pageSize );

    public Page<BasicBrandPromo> paginateBasicBrandPromos(String cityId, String districtId, int pageNo, int pageSize );

    /**
     * 添加品牌优惠信息
     * @param brandPromo
     * @return _id
     */
    public String addBrandPromo(BrandPromo brandPromo);

}
