package behaviorImpl.arraysBehaviorImpl;

import behavior.arraysBehavior.RandBehavior;

public class RandBehaviorImpl implements RandBehavior {

    @Override
    public int[] randArray(int size, int min, int max) {
        int x[] = new int[size];
        for (int i = 0; i < x.length; i++) {
            int random = (int) Math.round(Math.random()*((max - min)+1))+min;
            x[i] = random;
        }

        return x;
    }

    @Override
    public int[] randArray(int size, int max) {
        int x[] = new int[size];
        for (int i = 0; i < x.length; i++) {
            int random = (int) Math.round(Math.random() * max);
            x[i] = random;
        }
        return x;
    }

    @Override
    public void showArray(int[] x) {

        String temp = "";

        for (int i = 0; i < x.length; i++) {
            temp = temp + String.valueOf(x[i]) + " ";
        }

        System.out.println();
        System.out.print(temp);
    }
}
