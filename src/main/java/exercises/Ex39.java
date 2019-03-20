package exercises;

import java.util.List;

public class Ex39 {
    /*
    39. Даны целые числа a1, a2, ..., аn.
     Наименьший член этой последовательности заменить целой
     частью среднего арифметического всех членов, остальные члены оставить без изменения.
     Если в последовательности несколько наименьших членов, то заменить последний по порядку.
     */

    public List<Double> doConditional(List<Double> doubles) {
        double average;
        double sum = 0;
        double min = doubles.get(0);
        int positionOfLastElement = 0;

        for (Double i : doubles) {
            sum += i;
            if (i < min) {
                min = i;
            }
        }
        average = sum / doubles.size();


        for (int i = 0; i < doubles.size(); i++) {
            if (min == doubles.get(i)) {
                positionOfLastElement = i;
            }
        }

        doubles.set(positionOfLastElement, average);

        return doubles;
    }
}
