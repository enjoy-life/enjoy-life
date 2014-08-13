package com.enjoylife.brand.entity;

import com.enjoylife.brand.model.Brand;
import com.enjoylife.common.entity.Entity;
import org.bson.types.ObjectId;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-5
 * Time: PM11:09
 * To change this template use File | Settings | File Templates.
 */
public class BrandEntity extends Brand implements Entity {
    private static final long serialVersionUID = 8735920785610348005L;

    private ObjectId _id;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

}
