package behaviorImpl.arraysBehaviorImpl;

import behavior.arraysBehavior.DisplayArray;

public class DisplayArrayImpl implements DisplayArray {

    @Override
    public void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
