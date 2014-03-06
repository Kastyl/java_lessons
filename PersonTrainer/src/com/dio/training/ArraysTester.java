package com.dio.training;

import java.util.Arrays;

/**
 * Created by Виталий Сагайдак on 03.03.14.
 */
public class ArraysTester {

    public static void main(String[] args) {
        // write your code here
        Person person = new Person.Builder()
                .age(24)
                .email("s@d.com")
                .role(Position.DEVELOPER)
                .firstName("Vasya")
                .lastName("Pupkin")
                .phone("111-11-11")
                .build();

        Person[] employers = new Person[] {person, new Person.Builder(person).age(25).build()
                , new Person.Builder(person).age(40).firstName("Nick").build()
                ,new Person.Builder(person).age(20).firstName("Georg").build()
                ,new Person.Builder(person).age(30).firstName("VV").build()
        };
        Person[] devs = new Person[] {person, new Person.Builder(person).age(25).build()
                , new Person.Builder(person).age(40).firstName("Georg").build()
                ,new Person.Builder(person).age(20).firstName("QQ").build()
                ,new Person.Builder(person).age(30).firstName("OO").build()
        };

        System.out.println(Arrays.toString(employers));

        PersonHelper compare = new PersonHelper();

        Arrays.sort(employers,compare);
        System.out.println(Arrays.toString(employers));
        //System.out.println(Arrays.toString(devs));

//        ArraysHelper ah = new ArraysHelper();
//        Person[] allPeople = (Person[]) ah.rightJoin(employers,devs);
//        System.out.println(Arrays.toString(allPeople));
//
//        System.out.println(allPeople[0].getRole());

    }
}
