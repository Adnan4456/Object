package com.company;

class TestConstants {
    public static boolean debugFlag ;
    public static final String APP_NAME ;  // Line 1
    static {
        if (debugFlag) APP_NAME="FooBarApp";  // Line 2
        else  APP_NAME="GreatApp";
    }
}

public class Test {
    public static void main(String[] args) {
        TestConstants.debugFlag=true;  // Line 3
        System.out.println(TestConstants.APP_NAME);   // Line 4
    }
}