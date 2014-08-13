package com.enjoylife.common.utils;

import org.bson.types.ObjectId;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-13
 * Time: PM6:48
 * To change this template use File | Settings | File Templates.
 */
public class ObjectIdUtils {


    public static List<ObjectId> convertToObjectIds(List<String> ids) {
        if (CollectionUtils.isEmpty(ids))
            return null;
        List<ObjectId> objectIds = new ArrayList<ObjectId>();
        for (String brandId : ids) {
            objectIds.add(new ObjectId(brandId));
        }
        return objectIds;
    }


}
