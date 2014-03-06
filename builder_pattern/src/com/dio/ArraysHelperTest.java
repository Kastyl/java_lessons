package com.dio;

import java.util.Arrays;

/**
 * Created by kostya on 3/3/14.
 */
public class ArraysHelperTest {

    public boolean testRightJoin() {

        ArraysHelper ah = new ArraysHelper();

        Person[] leftArray = new Person[3];
        leftArray[0] = new Person.Builder()
                            .role(Position.MANAGER)
                            .age(35)
                            .firstName("Petya")
                            .lastName("Petrov")
                            .email("ppetrov@aol.com")
                            .phone("+38068 123 4567")
                            .build();

        leftArray[1] = new Person.Builder()
                            .role(Position.DEVELOPER)
                            .age(30)
                            .firstName("Ivan")
                            .lastName("Ivanov")
                            .email("iivanov@aol.com")
                            .phone("+38093 987 6543")
                            .build();

        leftArray[2] = new Person.Builder()
                            .role(Position.QA)
                            .age(25)
                            .firstName("Sidor")
                            .lastName("Sidorov")
                            .email("ssidorov@aol.com")
                            .phone("+38050 546 7328")
                            .build();

        Person[] rightArray = new Person[2];
        rightArray[0] = new Person.Builder()
                .role(Position.MANAGER)
                .age(50)
                .firstName("Tihon")
                .lastName("Tihonov")
                .email("ttihon@mail.ru")
                .phone("+38044 999 8877")
                .build();

        rightArray[1] = new Person.Builder()
                .role(Position.DEVELOPER)
                .age(30)
                .firstName("Ivan")
                .lastName("Ivanov")
                .email("iivanov@aol.com")
                .phone("+38093 987 6543")
                .build();

        Person[] resArray = new Person[3];
        resArray[0] = new Person.Builder()
                            .role(Position.MANAGER)
                            .age(50)
                            .firstName("Tihon")
                            .lastName("Tihonov")
                            .email("ttihon@mail.ru")
                            .phone("+38044 999 8877")
                            .build();

        resArray[1] = new Person.Builder()
                            .role(Position.DEVELOPER)
                            .age(30)
                            .firstName("Ivan")
                            .lastName("Ivanov")
                            .email("iivanov@aol.com")
                            .phone("+38093 987 6543")
                            .build();

        resArray[2] = new Person.Builder()
                            .role(Position.DEVELOPER)
                            .age(30)
                            .firstName("Ivan")
                            .lastName("Ivanov")
                            .email("iivanov@aol.com")
                            .phone("+38093 987 6543")
                            .build();

        Person[] joinedArray = ah.rightJoin(leftArray, rightArray);

        PersonComparator pc = new PersonComparator();

        Arrays.sort(joinedArray, pc);
        Arrays.sort(resArray, pc);

        return Arrays.equals(joinedArray, resArray);
    }

    public boolean testOuterJoin() {

        ArraysHelper ah = new ArraysHelper();

        Person[] leftArray = new Person[3];
        leftArray[0] = new Person.Builder()
                            .role(Position.MANAGER)
                            .age(35)
                            .firstName("Petya")
                            .lastName("Petrov")
                            .email("ppetrov@aol.com")
                            .phone("+38068 123 4567")
                            .build();

        leftArray[1] = new Person.Builder()
                            .role(Position.DEVELOPER)
                            .age(30)
                            .firstName("Ivan")
                            .lastName("Ivanov")
                            .email("iivanov@aol.com")
                            .phone("+38093 987 6543")
                            .build();

        leftArray[2] = new Person.Builder()
                            .role(Position.QA)
                            .age(25)
                            .firstName("Sidor")
                            .lastName("Sidorov")
                            .email("ssidorov@aol.com")
                            .phone("+38050 546 7328")
                            .build();

        Person[] rightArray = new Person[2];
        rightArray[0] = new Person.Builder()
                            .role(Position.MANAGER)
                            .age(50)
                            .firstName("Tihon")
                            .lastName("Tihonov")
                            .email("ttihon@mail.ru")
                            .phone("+38044 999 8877")
                            .build();

        rightArray[1] = new Person.Builder()
                            .role(Position.DEVELOPER)
                            .age(30)
                            .firstName("Ivan")
                            .lastName("Ivanov")
                            .email("iivanov@aol.com")
                            .phone("+38093 987 6543")
                            .build();

        Person[] resArray = new Person[3];
        resArray[0] = new Person.Builder()
                            .role(Position.MANAGER)
                            .age(50)
                            .firstName("Tihon")
                            .lastName("Tihonov")
                            .email("ttihon@mail.ru")
                            .phone("+38044 999 8877")
                            .build();

        resArray[1] = new Person.Builder()
                            .role(Position.QA)
                            .age(25)
                            .firstName("Sidor")
                            .lastName("Sidorov")
                            .email("ssidorov@aol.com")
                            .phone("+38050 546 7328")
                            .build();

        resArray[2] = new Person.Builder()
                            .role(Position.MANAGER)
                            .age(35)
                            .firstName("Petya")
                            .lastName("Petrov")
                            .email("ppetrov@aol.com")
                            .phone("+38068 123 4567")
                            .build();

        Person[] joinedArray = ah.outerJoin(leftArray, rightArray);

        PersonComparator pc = new PersonComparator();

        Arrays.sort(joinedArray, pc);
        Arrays.sort(resArray, pc);

        return Arrays.equals(joinedArray, resArray);
    }
}
