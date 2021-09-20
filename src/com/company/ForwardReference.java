package com.company;

class Thing
{
    //constructor
    Thing()
    {
        //After  initializer block constructor will run.
       // secondString = "b";
        secondString = "b" + thirdString;
        //because static variable is accessible declared below the statement.
        //but here we can not use firstString. it will give compile error.
    }

    //Initializer
    {
        //first this initializer block will run.
        //firstString = "a";
        firstString = "a"+ thirdString;
        //because static variable is accessible declared below the statement.
        //but here we can not use secondString. it will give compile error.
    }

    //Static Initializer
    static {
        //Error because static method use static variable after declaration.
//        System.out.println(thirdString);

        //At last static Initializer block will run.
        thirdString = "c";
    }
    //Two instance variable
    String firstString;
    String secondString;

    //Static variable
    static String thirdString;

    public String toString()
    {
        return firstString + secondString+ thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}
