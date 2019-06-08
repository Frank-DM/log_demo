package com.frank.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname LogbackDemo2
 * @Description TODO
 * @Date 2019/6/8 2:10
 * @Created by Frank
 */
public class LogbackDemo2 {
    // 获取日志记录器
    private final static Logger logger =  LoggerFactory.getLogger("demo2");

    public static void main(String[] args) {

        for (int i = 0;i< 100; i++){
            logger.debug("This is DEBUG level info on LogbackDemo2");

            logger.info("This is DEBUG level info on LogbackDemo2");

            logger.warn("This is DEBUG level info on LogbackDemo2");

            logger.error("This is DEBUG level info on LogbackDemo2");
        }


    }
}
