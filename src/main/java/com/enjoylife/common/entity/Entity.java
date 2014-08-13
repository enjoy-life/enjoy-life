package com.enjoylife.common.entity;

import org.bson.types.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-13
 * Time: PM1:48
 * To change this template use File | Settings | File Templates.
 */
public interface Entity {

    public ObjectId get_id();

    public void set_id(ObjectId _id);

}
