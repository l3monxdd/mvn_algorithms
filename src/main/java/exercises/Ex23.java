package exercises;

import behavior.listBehavior.RandomElementListGenerator;
import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;

import java.util.List;

public class Ex23 {
    //23. Последовательность a1, a2, ..., аn состоит из нулей и единиц.
    // Поставить в начало этой последовательности нули, а затем единицы.

    private RandomElementListGenerator randomElementListGenerator;

    public List<Integer> getRandomElements(int size, int min, int max) {
        randomElementListGenerator = new RandomElementListGeneratorImpl();
        return randomElementListGenerator.randomList(size, min, max);
    }

    public List<Integer> doCondition(List<Integer> integers) {
        int count = 0;
        for (Integer integer : integers) {
            if (integer == 0) {
                count++;
            }
        }

        for (int i = 0; i < integers.size(); i++) {
            if (i < count) {
                integers.set(i, 0);
            } else integers.set(i, 1);
        }

        return integers;
    }

}
