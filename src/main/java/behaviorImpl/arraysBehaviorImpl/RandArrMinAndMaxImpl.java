package behaviorImpl.arraysBehaviorImpl;

import behavior.arraysBehavior.RandArrMinAndMax;

public class RandArrMinAndMaxImpl implements RandArrMinAndMax{

    @Override
    public int[] randArray(int size, int min, int max) {
        int x[] = new int[size];
        for (int i = 0; i < x.length; i++) {
            int random = (int) Math.round(Math.random()*((max - min)))+min;
            x[i] = random;
        }

        return x;
    }
}
