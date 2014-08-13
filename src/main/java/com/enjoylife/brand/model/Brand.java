package com.enjoylife.brand.model;

import com.enjoylife.common.model.Image;
import com.enjoylife.common.model.Model;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-26
 * Time: PM4:00
 * To change this template use File | Settings | File Templates.
 */
public class Brand extends Model {
    private static final long serialVersionUID = -2645850739446640435L;

    private String name;
    private Image logo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

}
