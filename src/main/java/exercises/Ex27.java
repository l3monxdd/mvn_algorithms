package exercises;

import behavior.listBehavior.RandomElementListGenerator;
import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;

import java.util.List;

public class Ex27 {
    //27. Дан массив действительных чисел. Среди них есть равные.
    //  Найти первый максимальный элемент массива и заменить его нулем.

    private RandomElementListGenerator randomElementListGenerator;

    public List<Integer> getRandomElements(int size, int min, int max) {
        randomElementListGenerator = new RandomElementListGeneratorImpl();
        return randomElementListGenerator.randomList(size, min, max);
    }

    public List<Integer> doConditional(List<Integer> integers) {
        int max = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == max) {
                integers.set(i, 0);
                break;
            }
        }
        return integers;
    }
}
