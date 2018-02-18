package com.lygone.ssm.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by panyi on 2018/2/17.
 */
public class LogUtils {
    private static Logger logger = Logger.getLogger(LogUtils.class);

    public static void main(String[] args) {
        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}
