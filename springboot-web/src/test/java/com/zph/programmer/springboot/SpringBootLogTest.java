package com.zph.programmer.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SpringBootLogTest  extends SpringBootApplicationTests{
    @Test
    public void logTest() {
        //日志的级别；
        //由低到高   trace<debug<info<warn<error
        //可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
        log.trace("这是trace日志...");
        log.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        log.info("这是info日志...");
        log.warn("这是warn日志...");
        log.error("这是error日志...");
    }
}
