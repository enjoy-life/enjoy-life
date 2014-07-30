package com.enjoylife.common.model.account;

import com.enjoylife.common.model.Image;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-30
 * Time: PM4:15
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5179091135589258771L;

    protected String id;
    protected String name;
    protected Image head;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getHead() {
        return head;
    }

    public void setHead(Image head) {
        this.head = head;
    }
}
