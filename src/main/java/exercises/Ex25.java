package exercises;

import behavior.listBehavior.RandomElementListGenerator;
import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;

import java.util.List;

public class Ex25 {
    //25. Даны действительные числа а1, а2, ..., аn.
    // Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).

    private RandomElementListGenerator randomElementListGenerator;

    public List<Integer> getRandomElements(int size, int min, int max) {
        randomElementListGenerator = new RandomElementListGeneratorImpl();
        return randomElementListGenerator.randomList(size, min, max);
    }

    public int doConditional(List<Integer> integers) {
        int z = integers.size() - 1;
        int max = (integers.get(0) + integers.get(z));
        for (int i = 0; i < integers.size() / 2; i++) {
            if (integers.get(i) + integers.get(z - i) > max) {
                max = integers.get(i) + integers.get(z - i);
            }
        }
        return max;
    }
}
