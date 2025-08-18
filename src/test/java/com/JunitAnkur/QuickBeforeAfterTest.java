package com.JunitAnkur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){

        // DB open request
        System.out.println("Before Class ");

    }

    @org.junit.Before
    public void setup(){
        System.out.println("Before test");
    }

    @org.junit.Test
    public void test1(){
        System.out.println("Test case 1 executed");
    }

    @org.junit.Test
    public void test2(){
        System.out.println("Test case 2 executed");
    }

    @org.junit.After
    public  void teardown(){
        System.out.println("After Test");
    }

    @org.junit.AfterClass
    public static void afterClass(){
// DB close request
        System.out.println("After Class ");

    }


}
