package com.dio;

/**
 * Created by kostya on 2/27/14.
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                            .role(Position.DEVELOPER)
                            .age(30)
                            .firstName("Vasya")
                            .lastName("Pupkin")
                            .email("vpupkin@aol.com")
                            .phone("+38068 123 4567")
                            .build();

        Person personCopy = new Person.Builder(person).phone("+38050 987 6543").build();

        ArraysHelperTest aht = new ArraysHelperTest();

        if (aht.testRightJoin())
            System.out.println("Right join works sucessfully");
        else
            System.out.println("Right join doesnt works");

        if (aht.testOuterJoin())
            System.out.println("Outer join works sucessfully");
        else
            System.out.println("Outer join doesnt works");
    }
}
