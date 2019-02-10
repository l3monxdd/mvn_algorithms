package exercises;

import behavior.arraysBehavior.DisplayArray;
import behavior.arraysBehavior.RandArrMinAndMax;
import behaviorImpl.arraysBehaviorImpl.DisplayArrayImpl;
import behaviorImpl.arraysBehaviorImpl.RandArrMinAndMaxImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex21 {
    //21. Дана последовательность действительных чисел a1, a2, ..., аn.
    // Указать те ее элементы, которые принадлежат отрезку [с, d].

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

//    public void doConditional(int n, int c, int d, int min, int max) {
//        int[] arr = randArrMinAndMax.randArray(n, min, max);
//        displayArray.displayArray(arr);
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= c && arr[i] <= d) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
    public int[] randArray(int size, int min, int max) {
        int[] arr = randArrMinAndMax.randArray(size, min, max);
        displayArray.displayArray(arr);
        return arr;
    }

    public int[] doConditional(int[] arr, int c, int d) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= c && arr[i] <= d) {
                integers.add(arr[i]);
            }
        }
        Collections.sort(integers);
        int[] tempArr = new int[integers.size()];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = integers.get(i);
        }

        System.out.println();
        displayArray.displayArray(tempArr);
        return tempArr;
    }


}
