package com.dio;

import java.util.Comparator;

/**
 * Created by kostya on 2/27/14.
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        int result;

        result = person1.getFirstName().compareTo(person2.getFirstName());

        if (result != 0)
            return result;

        result = person1.getLastName().compareTo(person2.getLastName());

        if (result != 0)
            return result;

        if (person1.getAge() > person2.getAge())
            return 1;

        if (person1.getAge() < person2.getAge())
            return -1;

        return 0;
    }
}
