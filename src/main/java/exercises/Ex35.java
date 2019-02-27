package exercises;

import java.util.List;

public class Ex35 {
    /*
    35. Дан целочисленный массив с количеством элементов n.
     "Сожмите" массив, выбросив из него каждый второй элемент
     (дополнительный массив при этом не использовать).
     */

    public List<Integer> doConditional(List<Integer> integers) {
        for (int i = 1; i < integers.size(); i = i + 2) {
            integers.set(i, null);
        }
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == null) {
                integers.remove(i);
            }
        }
        return integers;
    }
}
