package com.company;

public class ObjectDeclaration {
    public static void main(String[] args) {

     //   Object a1 = b1, b1 = new Object();      // Line 1 //error
      //  Object a2 = b2 = new Object();       // Line 2 //error
        Object a3 = new String("testing"), b3 = new Object();   // Line 3
        Object a4 = new Object(), b4 = a4;   // Line 4
    }
}
