package com.enjoylife.brand.service;

import com.enjoylife.brand.model.Brand;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: PM6:10
 * To change this template use File | Settings | File Templates.
 */
public interface BrandService {

    public Brand loadBrand(String brandId);

    public List<Brand> getBrands(List<String> brandIds);

    public String addBrand(Brand brand);

}
