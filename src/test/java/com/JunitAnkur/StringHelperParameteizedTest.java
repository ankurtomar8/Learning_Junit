package com.JunitAnkur;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(Parameterized.class)
class StringHelperParameteizedTest {

    private StringHelper helper = new StringHelper();

   /* private String input;
    private  String expectOutput;

    public StringHelperParameteizedTest(String input, String expectOutput) {
        this.input = input;
        this.expectOutput = expectOutput;
    }*/

/*
    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutput[][]={ {"AACD","CD"},
        {"ACD", "CD"} };

        return Arrays.asList(expectedOutput);
    }
*/

    /*    @org.junit.jupiter.api.Test
    void testTruncateAInFirst2Positions() {

        assertEquals(expectOutput, helper.truncateAInFirst2Positions(input));
    }*/

/*
    @org.junit.jupiter.api.Test
   public void testTruncateAInFirst2PositionsAnother() {

        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }*/


    @ParameterizedTest
    @CsvSource({
            "AACD, CD",
            "ACD, CD"
    })

  //  @org.junit.jupiter.api.Test
    void testTruncateAInFirst2Positions(String input, String expectedOutput) {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }



}