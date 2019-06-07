package com.frank;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 * @Classname Log4jDemo
 * @Description Log4j Demo
 * @Date 2019/6/7 23:13
 * @Created by Frank
 */
public class Log4jDemo {

    //创建日志记录器 Logger
    private final static Logger logger = Logger.getLogger(Log4jDemo.class);
    public static void main(String[] args) {

        // 设置日志输出级别
        logger.setLevel(Level.DEBUG);

        // 输出Debug级别日志信息
        if (logger.isDebugEnabled()){
            logger.debug("This is DEBUG level info");
        }

        // 输出Debug级别日志信息
        if (logger.isInfoEnabled()){
            logger.info("This is INFO level info");
        }

        // 输出WARN级别日志信息
        logger.warn("This is WARN level info");

        // 输出ERROR级别日志信息

        logger.warn("This is ERROR level info");
    }

}
