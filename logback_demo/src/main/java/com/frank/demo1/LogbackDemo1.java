package com.frank.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname LogbackDemo1
 * @Description TODO
 * @Date 2019/6/8 2:09
 * @Created by Frank
 */
public class LogbackDemo1 {

    // 获取日志记录器
    private final static  Logger logger =  LoggerFactory.getLogger("demo1");

    public static void main(String[] args) {

        for (int i = 0 ;i<100;i++){

            // DEBUG level
            logger.debug("This is DEBUG level info on LogbackDemo1");
            // INFO level
            logger.info("This is INFO level info on LogbackDemo1");
            // WARN level
            logger.warn("This is WARN level info on LogbackDemo1");
            // ERROR level
            logger.error("This is ERROR level info on LogbackDemo1");

        }


    }
}
