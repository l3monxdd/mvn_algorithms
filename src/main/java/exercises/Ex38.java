package exercises;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
38. Дана последовательность целых чисел a1, a2, ..., аn.
 Указать пары чисел аi, аj, таких, что аi + аj = m.
 */
public class Ex38 {

    public Map<Pair, Pair> doConditional(List<Integer> integers, int m) {
        if (integers.isEmpty() || integers.size() == 1) {
            throw new IllegalArgumentException("size should be greater then one");
        }
        Map<Pair, Pair> pairMap = new HashMap<>();
        ImmutablePair<Integer, Integer> keyPair;
        ImmutablePair<Integer, Integer> valuePair;

        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i) + integers.get(j) == m) {
                    keyPair = new ImmutablePair<>(i, integers.get(i));
                    valuePair = new ImmutablePair<>(j, integers.get(j));
                    pairMap.put(keyPair, valuePair);
                }
            }
        }
        return pairMap;
    }
}
