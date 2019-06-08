package com.frank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname SLF4JandLog4j
 * @Description TODO
 * @Date 2019/6/8 22:28
 * @Created by Frank
 */
public class SLF4JandLog4j {

    // 通过SLF4J获取Log4j的日志记录器
    private final  static Logger logger = LoggerFactory.getLogger(SLF4JandLog4j.class);

    public static void main(String[] args) {
        logger.debug("SLF4J to print log4j DEBUG info");

        logger.info("SLF4J to print log4j INFO info");

        logger.warn("SLF4J to print log4j WARN info");

        logger.error("SLF4J to print log4j ERROR info");
    }
}
