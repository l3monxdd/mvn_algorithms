package exercises;

import java.util.List;

public class Ex28 {
    //28. Дана последовательность действительных чисел a1 ≤ a2 ≤ ... ≤ аn.
    // Вставить действительное число b в нее так, чтобы последовательность осталась неубывающей.

    public List<Float> doConditional(List<Float> floats, float b) {
        for (int i = 0; i < floats.size(); i++) {
            if (b <= floats.get(i)) {
                floats.add(i, b);
                break;
            }
        }
        return floats;
    }
}
