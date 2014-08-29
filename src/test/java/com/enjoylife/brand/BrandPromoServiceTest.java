package com.enjoylife.brand;

import com.enjoylife.brand.model.BrandPromo;
import com.enjoylife.brand.service.BrandPromoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-28
 * Time: PM10:42
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:config/spring/appcontext-*.xml"})
public class BrandPromoServiceTest {

    @Autowired
    private BrandPromoService brandPromoService;


    @Test
    public void addBrandPromoTest() {
        BrandPromo brandPromo = new BrandPromo();
        brandPromo.setBrandId("53eb0596b02e20d275cb4f26");
        brandPromo.setTitle("秋装盛宴，全场6折起");
        brandPromo.setContent("换季大换装，台风扫货季，真的超便宜~");
        brandPromo.setCityId("1");
        List<String> districtIds = new ArrayList<String>();
        districtIds.add("10");
        districtIds.add("11");
        brandPromo.setDistrictIds(districtIds);
        List<String> shopIds = new ArrayList<String>();
        shopIds.add("110");
        brandPromo.setShopIds(shopIds);
        brandPromo.setEffective(true);
        brandPromoService.addBrandPromo(brandPromo);
    }


}
