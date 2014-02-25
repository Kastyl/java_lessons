package com.dio;

import java.util.Arrays;

/**
 * Created by kostya on 2/25/14.
 */
public class ArraysHelperTest {

    public boolean testInnerJoin() {

        ArraysHelper ah = new ArraysHelper();

        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 3, 34, 45, 32, 5};
        int[] resArray = {5, 4, 32, 1};

        int[] joinedArray = ah.innerJoin(leftArray, rightArray);

        Arrays.sort(joinedArray);
        Arrays.sort(resArray);

        for (int i = 0; i < resArray.length; i++) {

            System.out.println("from method: " + joinedArray[i] + "; should be: " + resArray[i]);
        }

        if (Arrays.equals(joinedArray, resArray))
            return true;
        else
            return false;
    }

    public boolean testOuterJoin() {

        ArraysHelper ah = new ArraysHelper();

        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] resArray = {23, 65, 78, 3, 24, 2, 34, 45};

        int[] joinedArray = ah.outerJoin(leftArray, rightArray);

        Arrays.sort(joinedArray);
        Arrays.sort(resArray);

        for (int i = 0; i < resArray.length; i++) {

            System.out.println("from method: " + joinedArray[i] + "; should be: " + resArray[i]);
        }

        if (Arrays.equals(joinedArray, resArray))
            return true;
        else
            return false;
    }
}
