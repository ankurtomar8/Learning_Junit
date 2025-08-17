package com.JunitAnkur;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    private StringHelper helper = new StringHelper();

    @org.junit.jupiter.api.Test
    void testTruncateAInFirst2Positions() {

        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }


    @org.junit.jupiter.api.Test
   public void testTruncateAInFirst2PositionsAnother() {

        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    // ABCD ==> false, ABAB => true, AB=>true, A => false,

    @org.junit.jupiter.api.Test
    void areFirstAndLastTwoCharactersTheSame() {

        boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
        boolean expected = false;
        assertEquals(expected,actualValue);

    }

}