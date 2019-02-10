package behaviorImpl.arraysBehaviorImpl;

import behavior.arraysBehavior.DisplayDoubleArray;

public class DisplayDoubleArrayImpl implements DisplayDoubleArray {

    public void displayArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
