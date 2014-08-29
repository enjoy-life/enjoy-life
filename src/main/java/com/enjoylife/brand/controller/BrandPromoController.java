package com.enjoylife.brand.controller;

import com.enjoylife.brand.model.BrandPromo;
import com.enjoylife.brand.model.vo.BasicBrandPromo;
import com.enjoylife.brand.service.BrandPromoService;
import com.enjoylife.common.controller.Code;
import com.enjoylife.common.controller.Response;
import com.enjoylife.common.model.Page;
import com.enjoylife.common.utils.ArrayUtils;
import com.enjoylife.common.utils.PageUtils;
import com.enjoylife.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-27
 * Time: AM12:27
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/brandpromo")
public class BrandPromoController {

    @Autowired
    private BrandPromoService brandPromoService;

    /**
     * 分页获取基础品牌折扣信息
     * ~/brandpromo/paginate?cityId=1&districtId=10&pageNo=1&pageSize=10
     * @param cityId required
     * @param districtId optional
     * @param pageNo required
     * @param pageSize required
     * @return
     */
    @RequestMapping(value = "/paginate", method = RequestMethod.GET)
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
        Response<Page<BasicBrandPromo>> response = new Response<Page<BasicBrandPromo>>(Code.SUCCESS, "SUCCESS", basicBrandPromoPage);
        return response;
    }

    /**
     * 添加品牌折扣信息
     * ~/brandpromo/add
     * @param brandPromo auto
     * @param brandId required
     * @param title required
     * @param content required
     * @param cityId required
     * @param districtIdsStr optional
     * @param shopIdsStr optional
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody Response addBrandPromo(
           BrandPromo brandPromo,
           @RequestParam(value = "brandId") String brandId,
           @RequestParam(value = "title") String title,
           @RequestParam(value = "content") String content,
           @RequestParam(value = "cityId") String cityId,
           @RequestParam(value = "districtIdsStr") String districtIdsStr,
           @RequestParam(value = "shopIdsStr") String shopIdsStr
    ) {
        if ( brandPromo==null || StringUtils.isEmpty(brandId) || StringUtils.isEmpty(title) || StringUtils.isEmpty(content) || StringUtils.isEmpty(cityId) )
            return Response.DEFAULT_ILLEGAL_PARAM_RESPONSE;

        if ( StringUtils.isNotEmpty(districtIdsStr) ) {
            List<String> districtIds = ArrayUtils.toList(districtIdsStr.split(","));
            brandPromo.setDistrictIds(districtIds);
        }

        if ( StringUtils.isNotEmpty(shopIdsStr) ) {
            List<String> shopIds = ArrayUtils.toList(shopIdsStr.split(","));
            brandPromo.setShopIds(shopIds);
        }

        String brandPromoId = brandPromoService.addBrandPromo(brandPromo);

        Response<String> response = new Response<String>(Code.SUCCESS, "SUCCESS", brandPromoId);
        return response;
    }






}
