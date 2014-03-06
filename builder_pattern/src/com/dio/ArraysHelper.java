package com.dio;

import java.util.Arrays;

/**
 * Created by kostya on 2/27/14.
 */
public class ArraysHelper {

    public Person[] rightJoin(Person[] leftArray, Person[] rightArray) {

        Person[] tempArray = new Person[leftArray.length];
        int j = 0;

        for (int i = 0; i < leftArray.length; i++) {

            if (!isElementAbsent(leftArray[i], rightArray)) {

                tempArray[j] = leftArray[i];
                j++;
            }
        }

        return merge(rightArray, Arrays.copyOf(tempArray, j));
    }

    public Person[] outerJoin(Person[] leftArray, Person[] rightArray) {

        Person[] tempArray = new Person[leftArray.length + rightArray.length];
        int tempCounter = 0;

        for (int i = 0; i < leftArray.length; i++) {

            if (isElementAbsent(leftArray[i], rightArray) && isElementAbsent(leftArray[i], tempArray)) {

                tempArray[tempCounter] = leftArray[i];
                tempCounter++;
            }
        }

        for (int i = 0; i < rightArray.length; i++) {

            if (isElementAbsent(rightArray[i], leftArray) && isElementAbsent(rightArray[i], tempArray)) {

                tempArray[tempCounter] = rightArray[i];
                tempCounter++;
            }
        }

        Person[] resArray = new Person[tempCounter];
        for (int i = 0; i < tempCounter; i++) {

            resArray[i] = tempArray[i];
        }

        return resArray;
    }

    private boolean isElementAbsent(Person person, Person[] searchArray) {

        for (int k = 0; k < searchArray.length; k++) {

            if (person.equals(searchArray[k]))
                return false;
        }

        return true;
    }

    private Person[] merge (Person[] firstArray, Person[] secondArray) {

        Person[] resultArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

        int i = firstArray.length;
        for (Person element:secondArray){

            resultArray[i] = element;
            i++;
        }

        return resultArray;
    }
}
