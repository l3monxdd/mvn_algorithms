package exercises;

import java.util.List;

public class Ex37 {
    /*
    37. Задан массив с количеством элементов N.
     Сформируйте два массива: в первый включите элементы исходного массива с четными номерами,
     а во второй – с нечетными.
     */

    public void doConditional(List<Integer> integers, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        for (int i = 0; i < integers.size(); i++) {
            if (i % 2 == 0) {
                evenNumbers.add(integers.get(i));
            } else {
                oddNumbers.add(integers.get(i));
            }
        }
    }
}
