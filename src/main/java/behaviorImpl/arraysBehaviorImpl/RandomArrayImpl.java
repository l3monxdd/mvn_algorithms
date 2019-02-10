package behaviorImpl.arraysBehaviorImpl;

import behavior.arraysBehavior.RandomArray;

public class RandomArrayImpl implements RandomArray {

    @Override
    public int[] randomArray(int size) {
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random()*9);
        }
        return arr;
    }

}
