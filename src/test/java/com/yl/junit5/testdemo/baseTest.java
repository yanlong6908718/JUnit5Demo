package com.yl.junit5.testdemo;
import com.yl.junit5.demo.service.Calculator;
import org.junit.jupiter.api.BeforeAll;


public class baseTest {
    protected static Calculator ca;
    @BeforeAll
    public static void befer(){
        ca=new Calculator();
        System.out.println("123123");
//        return ca;
    }
}
