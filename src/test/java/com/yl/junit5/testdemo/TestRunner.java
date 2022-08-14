package com.yl.junit5.testdemo;

import com.yl.junit5.testdemo.addition.additionTest;
import com.yl.junit5.testdemo.subtraction.subtractionTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({additionTest.class, subtractionTest.class})
public class TestRunner {

}
