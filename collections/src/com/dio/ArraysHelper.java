package com.dio;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kostya on 3/4/14.
 */
public class ArraysHelper {

    public ArrayList<Person> rightJoin(ArrayList<Person> leftList, ArrayList<Person> rightList) {

        for (int i = 0; i < leftList.size(); i++) {

            if (rightList.contains(leftList.get(i)))
                rightList.add(leftList.get(i));
        }

        return rightList;
    }


    private ArrayList<Person> merge (ArrayList<Person> firstList, ArrayList<Person> secondList) {

        //firstList.addAll(secondList);
        //firstList.

        ArrayList<Person> resList = new ArrayList<Person>();

        for (int i = 0; i < firstList.size(); i++) {

            if (!secondList.contains(firstList.get(i)) && !resList.contains(firstList.get(i)))
                resList.add(firstList.get(i));
        }

        for (int i = 0; i < secondList.size(); i++) {

            if (!resList.contains(secondList.get(i)))
                resList.add(secondList.get(i));
        }

        return resList;
    }
}
