package com.TimoProject.SellApp;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTesting {
    @Test
    public void test1(){
        String name ="imooc";
        String password="123456";
        log.debug("debug...");
        log.info("Name: "+name+", password: "+password);
        log.info("name: {}, password: {}", name, password);
        log.error("error...");

    }
}
