package com.enjoylife.common.model.poi.entity;

import com.enjoylife.common.entity.Entity;
import com.enjoylife.common.model.poi.City;
import org.bson.types.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-30
 * Time: PM4:33
 * To change this template use File | Settings | File Templates.
 */
public class CityEntity extends City implements Entity {
    private static final long serialVersionUID = 2372834379578733589L;

    private ObjectId _id;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
