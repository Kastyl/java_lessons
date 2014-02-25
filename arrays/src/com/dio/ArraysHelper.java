package com.dio;

/**
 * Created by kostya on 2/25/14.
 */
public class ArraysHelper {

    private int tempLength;
    private int[] tempArray;
    private int tempCounter;

    public int[] innerJoin(int[] leftArray, int[] rightArray) {

        if (leftArray.length > rightArray.length)
            tempLength = rightArray.length;
        else
            tempLength = leftArray.length;

        tempArray = new int[tempLength];
        tempCounter = 0;

        for (int i = 0; i < leftArray.length; i++) {

            for (int j = 0; j < rightArray.length; j++) {

                if (leftArray[i] == rightArray[j] && isElementAbsent(leftArray[i], tempArray)) {

                    tempArray[tempCounter] = leftArray[i];
                    tempCounter++;
                    break;
                }
            }
        }

        int[] resArray = new int[tempCounter];
        for (int i = 0; i < tempCounter; i++) {

            resArray[i] = tempArray[i];
        }

        return resArray;
    }

    public int[] outerJoin(int[] leftArray, int[] rightArray) {

        tempArray = new int[leftArray.length + rightArray.length];
        tempCounter = 0;

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

        int[] resArray = new int[tempCounter];
        for (int i = 0; i < tempCounter; i++) {

            resArray[i] = tempArray[i];
        }

        return resArray;
    }

    private boolean isElementAbsent(int value, int[] searchArray) {

        for (int k = 0; k < searchArray.length; k++) {

            if (value == searchArray[k])
                return false;
        }

        return true;
    }
}
