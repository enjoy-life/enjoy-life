package com.enjoylife.brand;

import com.enjoylife.brand.model.Brand;
import com.enjoylife.brand.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-13
 * Time: PM2:17
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:config/spring/appcontext-*.xml"})
public class BrandServiceTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void addBrandTest() {
        Brand brand = new Brand();
        brand.setName("selected");
        brand.setAddTime(new Date());
        brand.setUpdateTime(new Date());
        brandService.addBrand(brand);
        System.out.println(brand.getId());
    }

    @Test
    public void loadBrand() {
        String brandId = "53eb0596b02e20d275cb4f26";
        Brand brand = brandService.loadBrand(brandId);
        System.out.println(brand.getName());
    }

    @Test
    public void getBrandsTest() {
        List<String> brandIds = new ArrayList<String>();
        brandIds.add("53eb0596b02e20d275cb4f26");
        List<Brand> brands = brandService.getBrands(brandIds);
        System.out.println(brands.size());
    }



}
