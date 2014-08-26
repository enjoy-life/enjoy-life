package com.enjoylife.brand.controller;

import com.enjoylife.brand.model.vo.BasicBrandPromo;
import com.enjoylife.brand.service.BrandPromoService;
import com.enjoylife.common.controller.Code;
import com.enjoylife.common.controller.Response;
import com.enjoylife.common.model.Page;
import com.enjoylife.common.utils.PageUtils;
import com.enjoylife.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-27
 * Time: AM12:27
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/brand")
public class BrandPromoController {

    @Autowired
    private BrandPromoService brandPromoService;

    //  ~/brand/paginate/promos
    @RequestMapping(value = "/paginate/promos", method = RequestMethod.GET)
    public @ResponseBody Response<Page<BasicBrandPromo>> paginateBasicBrandPromos(
           @RequestParam(value = "cityId") String cityId,
           @RequestParam(value = "districtId") String districtId,
           @RequestParam(value = "pageNo") int pageNo,
           @RequestParam(value = "pageSize") int pageSize
    ) {

        if (StringUtils.isEmpty(cityId) || !PageUtils.isValid(pageNo, pageSize) ) {
            return Response.DEFAULT_ILLEGAL_PARAM_RESPONSE;
        }

        Page<BasicBrandPromo> basicBrandPromoPage;
        if (StringUtils.isEmpty(districtId)) {
            basicBrandPromoPage = brandPromoService.paginateBasicBrandPromos(cityId, pageNo, pageSize);
        } else {
            basicBrandPromoPage = brandPromoService.paginateBasicBrandPromos(cityId, districtId, pageNo, pageSize);
        }
        Response<Page<BasicBrandPromo>> response = new Response<Page<BasicBrandPromo>>(Code.SUCCESS, basicBrandPromoPage);
        return response;
    }




}
