package exercises;

import behavior.listBehavior.RandomElementListGenerator;
import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;

import java.util.List;

public class Ex26 {
    //26. В последовательности действительных чисел а1, а2, ..., аn
    //  есть только положительные и отрицательные элементы.
    // Вычислить произведение отрицательных элементов P1 
    // и произведение положительных элементов Р2. Сравнить модуль Р2
    //  с модулем Р1 и указать, какое из произведений по модулю больше.

    private RandomElementListGenerator randomElementListGenerator;

    public List<Integer> getRandomElements(int size, int min, int max) {
        randomElementListGenerator = new RandomElementListGeneratorImpl();
        return randomElementListGenerator.randomList(size, min, max);
    }

    public String doConditional(List<Integer> integers) {
        int positiveElements = 1;
        int negativeElements = 1;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > 0) {
                positiveElements *= integers.get(i);
            } else if (integers.get(i) < 0) {
                negativeElements *= integers.get(i);
            }
        }

        if (Math.abs(positiveElements) > Math.abs(negativeElements)) {
            return "positive > negative";
        } else if (Math.abs(positiveElements) < Math.abs(negativeElements)) {
            return "negative > positive";
        } else return "equal";

    }

}
