package exercises;

import behavior.listBehavior.RandomElementListGenerator;
import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;

import java.util.List;

public class Ex24 {
    //24. Даны действительные числа a1, a2, ..., аn. Среди них есть положительные и отрицательные. 
    // Заменить нулями те числа,
    // величина которых по модулю больше максимального числа (|ai| > max{a1, a2, ..., аn}).

    private RandomElementListGenerator randomElementListGenerator;

    public List<Integer> getRandomElement(int size, int min, int max) {
        randomElementListGenerator = new RandomElementListGeneratorImpl();
        return randomElementListGenerator.randomList(size, min, max);
    }

    public List<Integer> doConditional(List<Integer> integers) {
        int max = integers.get(0);
        for (Integer integer : integers) {
            if (integer > max) max = integer;
        }

        for (int i = 0; i < integers.size(); i++) {
            if (Math.abs(integers.get(i)) > max) integers.set(i, 0);
        }
        return integers;
    }
}
