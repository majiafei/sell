package org.giveu.sell.mjf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SellApplication {

    //日志
    private static  Logger logger = LoggerFactory.getLogger(SellApplication.class);

    public static void main(String[] args){
        SpringApplication.run(SellApplication.class,args);
        logger.info("SellApplication run success");
    }

}
