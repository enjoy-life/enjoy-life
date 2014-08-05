package com.enjoylife.demo;

import com.enjoylife.common.db.mongo.GenericDao;
import org.jongo.Jongo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-4
 * Time: AM2:50
 * To change this template use File | Settings | File Templates.
 */
public class UserTestDao extends GenericDao<UserEntity> {

    public UserTestDao(Jongo jongo) {
        super("UserTest", UserEntity.class, jongo);
    }

}
