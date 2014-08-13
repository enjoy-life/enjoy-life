package com.enjoylife.brand.entity;

import com.enjoylife.brand.model.BrandPromo;
import com.enjoylife.common.entity.Entity;
import org.bson.types.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-10
 * Time: AM10:29
 * To change this template use File | Settings | File Templates.
 */
public class BrandPromoEntity extends BrandPromo implements Entity {
    private static final long serialVersionUID = -6897674742355878905L;

    private ObjectId _id;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

}
