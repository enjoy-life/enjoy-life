package com.enjoylife.common.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-27
 * Time: PM5:08
 * To change this template use File | Settings | File Templates.
 */
public class Image implements Serializable {
    private static final long serialVersionUID = 6334114775513811294L;

    private String id;
    private String url;
    private Integer length;
    private Integer width;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
