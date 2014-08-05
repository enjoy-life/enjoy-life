package com.enjoylife.common.db.mongo;

import com.mongodb.Mongo;
import com.mongodb.MongoURI;
import com.mongodb.WriteConcern;
import org.apache.log4j.Logger;
import org.jongo.Jongo;
import java.net.UnknownHostException;


/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-30
 * Time: PM4:58
 * To change this template use File | Settings | File Templates.
 */
public class JongoFactory {

    private static final Logger logger = Logger.getLogger(JongoFactory.class);
    private static Jongo jongo;

    public static Jongo getJongo(String uri, String dbName) throws Exception {
        if (jongo == null) {
            checkDBParams(uri, dbName);
            synchronized (JongoFactory.class) {
                if (jongo == null) {
                    jongo = generateJongo(uri, dbName);
                }
            }
        }
        return jongo;
    }

    private static void checkDBParams(String uri, String dbName) throws Exception {
        if(uri==null || dbName==null){
            Exception exception = new RuntimeException("start mongodb with invalid params");
            logger.error(exception);
            throw exception;
        }
    }

    private static Jongo generateJongo(String uri, String dbName) throws UnknownHostException {
        Mongo mongoSafe = new Mongo(new MongoURI("mongodb://"+uri));
        mongoSafe.setWriteConcern( WriteConcern.SAFE );
        return new Jongo(mongoSafe.getDB(dbName));
    }



}
