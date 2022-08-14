package com.yl.junit5.testdemo.subtraction;

import com.yl.junit5.testdemo.baseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("subtractionTest")
@DisplayName("subtractionTest")
public class subtractionTest extends baseTest {
    @ParameterizedTest
    @CsvSource({"1,2","5,6"})
    @Tag("nagetive")
    @DisplayName("assert nagetive result")
    void nagetiveNumber(float a,float b) {
        System.out.println("assert nagetive result: "+ca.sub(a,b));
    }
    @ParameterizedTest
    @CsvSource({"0.2,0.01","5,0.5"})
    @Tag("decimals")
    @DisplayName("assert decimals result")
    void decimalsNumber(float a,float b) {
        System.out.println("assert decimals result: "+ca.sub(a,b));
    }
}
