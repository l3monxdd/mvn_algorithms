package exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex30 {
    // 30. Дана последовательность целых чисел a1, a2, ..., аn.
    // Образовать новую последовательность, выбросив из исходной те члены,
    // которые равны  min(a1, a2, ..., аn).

    public List<Integer> doConditional(List<Integer> integers) {
        List<Integer> temp = new ArrayList<>();
        if (integers.size() == 0) {
            throw new IllegalArgumentException("size equal 0");
        }
        int min = integers.get(0);

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < min) {
                min = integers.get(i);
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) != min) {
                temp.add(integers.get(i));
            }
        }
        return temp;
    }
}
