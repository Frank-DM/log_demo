package com.frank.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname Demo3
 * @Description TODO
 * @Date 2019/6/8 21:32
 * @Created by Frank
 */
public class LogbackDemo3 {
    // 获取日志记录器
    private final static Logger logger =  LoggerFactory.getLogger("demo3");

    public static void main(String[] args) {

        for (int i = 0;i< 100; i++){

            logger.debug("This is DEBUG level info on LogbackDemo3"+i);


            logger.info("This is DEBUG level info on LogbackDemo3"+i);

            logger.warn("This is DEBUG level info on LogbackDemo3"+i);

            logger.error("This is DEBUG level info on LogbackDemo3"+i);
        }


    }
}
