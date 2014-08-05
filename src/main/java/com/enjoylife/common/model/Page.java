package com.enjoylife.common.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 13-12-25
 * Time: PM5:44
 * To change this template use File | Settings | File Templates.
 */
public class Page<T> implements Serializable {

    private static final long serialVersionUID = -4272544971040417942L;

    private int pageNo;
    private int pageSize;
    private List<T> records;


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }



}
