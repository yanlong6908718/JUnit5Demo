package com.yl.junit5.testdemo.addition;


import com.yl.junit5.testdemo.baseTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Tag("additionTest")
@DisplayName("additionTest")
public class additionTest extends baseTest {


    @ParameterizedTest
    @CsvSource({"1,2","5,6"})
    @Tag("add")
    @DisplayName("Integer addition")
    void integerAdd(int a,int b) {
        String expected = "Hii";
        System.out.println(666);
        assertEquals(expected,ca.add(a,b),"incorrect!!");
    }

    @Test
    void assertAllTest() {
        String expected = "Hii";
        String nullValue = null;
        assertAll(
                () -> assertEquals(expected, "", "incorrect!!"),
                () -> assertFalse(nullValue != null),
                () -> assertNull(nullValue),
                () -> assertNull("not null", "incorrect!"),
                () -> assertTrue(nullValue == null));
    }
}
