package com.dio.training;


import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Nick Chigir on 27.02.14.
 * Left/Right/Merge join operations with arrays
 */
public class ArraysHelper {

    public Object[] leftJoin(Object[] leftArray, Object[] rightArray) {
            Object[] tempArray = innerJoin(rightArray,leftArray,true);
            return   merge(leftArray,tempArray); //resultArray;
        }

    public  Object[] rightJoin(Object[] leftArray, Object[] rightArray) {
        Object[] tempArray = innerJoin(leftArray,rightArray,true);

        return   merge(rightArray,tempArray); //resultArray;
    }

    /**
         *
         * @param leftArray
         * @param rightArray
         * @return elements found both in leftArray and rightArray without duplicates
         */
    public  Object[] innerJoin (Object[] leftArray, Object[] rightArray ){

            return innerJoin(leftArray, rightArray,false);
        }

    public  Object[] outerJoin (Object[] leftArray, Object[] rightArray ){

            Object[] firstArray = Arrays.copyOf(leftArray,leftArray.length);
            Object[] secondArray = Arrays.copyOf(rightArray,rightArray.length);

            // System.out.println(Arrays.toString(firstArray));
            //System.out.println(Arrays.toString(secondArray));

            Object[] leftOutArray = leftOuterJoin(firstArray,secondArray,false);
            Object[] rightOutArray = leftOuterJoin(secondArray, firstArray,false);

            return merge(leftOutArray,rightOutArray);
        }

    public  Object[] mergeJoin (Object[] leftArray, Object[] rightArray ){

            Object[] firstArray = Arrays.copyOf(leftArray,leftArray.length);
            Object[] secondArray = Arrays.copyOf(rightArray,rightArray.length);

           Arrays.sort(firstArray);
           // Arrays.sort(secondArray);
            // System.out.println(Arrays.toString(firstArray));
            //System.out.println(Arrays.toString(secondArray));

            Object[] leftOutArray = innerJoin(firstArray, firstArray,false);
            Object[] rightOutArray = leftOuterJoin(secondArray, firstArray,false);

            return merge(leftOutArray,rightOutArray);
        }

    private Object[] merge (Object[] firstArray, Object[] secondArray) {
        Object [] resultArray = Arrays.copyOf(firstArray,firstArray.length+ secondArray.length);
        //System.out.println(Arrays.toString(resultArray));
        int i = firstArray.length;
        for (Object element:secondArray){
            resultArray[i] = element;
            i++;
        };
        return resultArray;
    }

    private Boolean isContain(Object key, Object[] source){
          for (Object o: source ){
              if(o.equals(key)) return true;
          };
           return false ;
        };

    private Object[] innerJoin (Object[] sourceArray, Object[] keyArray, Boolean withDuplicates){
        Object[] tempArray = new Object[sourceArray.length];
        int j =0;
        for (Object i:sourceArray){
            if( isContain(i,keyArray) &&(withDuplicates || (!isContain(i,tempArray))) ){
                tempArray[j]=i;
                j++;

            }
        }
        return Arrays.copyOf(tempArray,j);

    }

    private Object[] leftOuterJoin (Object[] sourceArray, Object[] keyArray, Boolean withDuplicates){
        Object[] tempArray = new Object[sourceArray.length];
        int j =0;
        for (Object i:sourceArray){
            if( !isContain(i,keyArray) &&(withDuplicates || (!isContain(i,tempArray))) ){
                tempArray[j]=i;
                j++;

            }
        }
        return Arrays.copyOf(tempArray,j);

    }

}
