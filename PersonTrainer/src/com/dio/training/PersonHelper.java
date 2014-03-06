package com.dio.training;
import java.util.*;
/**
 * Created by Nick Chigir on 03.03.14.
 *
 */
public class PersonHelper implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        int result;
        if(o1 instanceof Person && o2 instanceof Person){
            Person person1 = (Person)o1;
            Person person2 = (Person)o2;
            result = person1.getFirstName().compareTo(person2.getFirstName());
            if (result!=0) return result;
            result = person1.getLastName().compareTo(person2.getLastName());
            if (result!=0) return result;
            if (person1.getAge()>person2.getAge()) return 1;
            if (person1.getAge()<person2.getAge()) return -1;
        return 0;
        }
     return 0;
    }
}
