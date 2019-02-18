package exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex29 {
    //29. Даны целые положительные числа а1, а2, ..., an.
    // Найти среди них те, которые являются квадратами некоторого числа m.

    public List<Integer> doConditional(List<Integer> integers, int m) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (((int) Math.sqrt(integers.get(i))) == m) {
                temp.add(integers.get(i));
            }
        }
        return temp;
    }
}
