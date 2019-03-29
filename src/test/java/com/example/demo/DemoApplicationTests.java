package com.example.demo;

import com.example.demo.user.properties.DemoProperties;
import com.example.demo.user.properties.MyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    MyProperties myProperties;

    @Autowired
    DemoProperties demoProperties;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testProperties(){
        System.out.println(myProperties.title);
        System.out.println(myProperties.description);
    }

    @Test
    public void testDemoProperties(){
        System.out.println(demoProperties.title);
        System.out.println(demoProperties.description);
    }

}
