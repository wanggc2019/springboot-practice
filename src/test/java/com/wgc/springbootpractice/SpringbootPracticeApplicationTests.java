package com.wgc.springbootpractice;

import com.wgc.springbootpractice.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * springboot的单元测试
 * */
@SpringBootTest
class SpringbootPracticeApplicationTests {

    //日志记录器
    private static Logger logger = LoggerFactory.getLogger(SpringbootPracticeApplication.class);

    //@Autowired
    //Person person;

    @Test
    void contextLoads() {
        logger.trace("trace log");
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("info log");
        logger.error("error log");


        //System.out.println(person);
    }

}
