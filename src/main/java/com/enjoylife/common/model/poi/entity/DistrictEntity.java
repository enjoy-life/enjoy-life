package com.enjoylife.common.model.poi.entity;

import com.enjoylife.common.entity.Entity;
import com.enjoylife.common.model.poi.District;
import org.bson.types.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM4:34
 * To change this template use File | Settings | File Templates.
 */
public class DistrictEntity extends District implements Entity {

    private static final long serialVersionUID = -7255507175792132379L;

    private ObjectId _id;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

}
