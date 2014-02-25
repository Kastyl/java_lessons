package com.dio;

/**
 * Created by kostya on 2/25/14.
 */
public class Main {

    public static void main(String[] args) {

        ArraysHelperTest aht = new ArraysHelperTest();

        if (aht.testInnerJoin())
            System.out.println("Inner join works sucessfully");
        else
            System.out.println("Inner join doesnt works");

        if (aht.testOuterJoin())
            System.out.println("Outer join works sucessfully");
        else
            System.out.println("Outer join doesnt works");
    }
}
