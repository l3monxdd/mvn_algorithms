package exercises;

import behavior.listBehavior.RandomElementListGenerator;
import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;

import java.util.List;

public class Ex22 {
    //22. Дана последовательность целых положительных чисел.
    // Найти произведение только тех чисел, которые больше заданного числа М.
    // Если таких нет, то выдать сообщение об этом.

    private RandomElementListGenerator randomElementListGenerator = new RandomElementListGeneratorImpl();

    public Integer doConditional(int m, List<Integer> integers) throws Exception {
        int prod = 1;
        boolean checkIfGreaterDigitExist = false;

        for (Integer i : integers) {
            if (m < i) {
                prod *= i;
                checkIfGreaterDigitExist = true;
            }
        }

        if (!checkIfGreaterDigitExist) {
            throw new Exception("you have no digit greater than " + m);
        }

        return prod;
    }

    public List<Integer> getRandomList(int size, int min, int max) {
        return randomElementListGenerator.randomList(size, min, max);
    }


}
