package com.enjoylife.common.utils;

import com.enjoylife.common.entity.Entity;
import com.enjoylife.common.model.Model;
import com.enjoylife.common.model.Page;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-5
 * Time: PM11:24
 * To change this template use File | Settings | File Templates.
 */
public class EntityAndModelConvertEachOtherUtils {

    private static final Logger logger = Logger.getLogger(EntityAndModelConvertEachOtherUtils.class);

    public static Object fromModelToEntity(Object model, Class entityClazz){
        if(model==null || entityClazz==null)
            return null;
        Object entity;
        try {
            entity = entityClazz.newInstance();
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
        BeanUtils.copyProperties(model, entity);
        return entity;
    }

    public static List fromModelToEntity(List models, Class entityClazz){
        if(CollectionUtils.isEmpty(models))
            return null;
        List result = new LinkedList();
        for(Object model : models){
            result.add(fromModelToEntity(model, entityClazz));
        }
        return result;
    }




    public static Object fromEntityToModel(Object entity, Class modelClazz){
        if(entity==null || modelClazz==null)
            return null;
        Object model;
        try{
            model = modelClazz.newInstance();
        }catch (Exception e){
            logger.error(e);
            return null;
        }
        BeanUtils.copyProperties(entity, model);
        try {
            Model m = (Model) model;
            Entity e = (Entity) entity;
            m.setId(e.get_id().toString());
        } catch (Exception e) {
            logger.error(e);
        }
        return model;
    }

    public static List fromEntityToModel(List entitys, Class modelClazz){
        if(CollectionUtils.isEmpty(entitys))
            return null;
        List result = new LinkedList();
        for(Object entity : entitys){
            result.add(fromEntityToModel(entity, modelClazz));
        }
        return result;
    }

    public static Page fromEntityToModel(Page entitysPage, Class modelClazz){
        if(entitysPage==null || modelClazz==null)
            return null;
        entitysPage.setRecords(fromEntityToModel(entitysPage.getRecords(), modelClazz));
        return entitysPage;
    }



}
