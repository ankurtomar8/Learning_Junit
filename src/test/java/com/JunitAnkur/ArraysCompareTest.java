package com.JunitAnkur;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysCompareTest {
    // Arrays.sort

    @org.junit.Test
    public void testArraySort_RandomArray(){
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};

        Arrays.sort(numbers);
    //    assertEquals(expected,numbers);
        assertArrayEquals(expected,numbers);

    }

    @org.junit.Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int[] numbers =null;
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
/*
        try{
            Arrays.sort(numbers);
        }catch (NullPointerException e){
            //success
        }*/


        //    assertEquals(expected,numbers);
       // assertArrayEquals(expected,numbers);

    }
}
