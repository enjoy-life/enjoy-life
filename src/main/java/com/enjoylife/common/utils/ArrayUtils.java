package com.enjoylife.common.utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-28
 * Time: PM11:58
 * To change this template use File | Settings | File Templates.
 */
public class ArrayUtils {

    public static <T> List<T> toList(T[] array) {
        if ( array==null )
            return new ArrayList<T>();
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(array));
        return arrayList;
    }

}
