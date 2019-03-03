package exercises;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Stream;

class Ex38Test {

    private static Ex38 ex38;

    @BeforeAll
    private static void init(){
        ex38 = new Ex38();
    }

    private static Stream<Arguments> doConditionalData(){
        Map<Pair, Pair> expected = new HashMap<>();
        expected.put(new ImmutablePair<>(0, 2), new ImmutablePair<>(1, 4));
        expected.put(new ImmutablePair<>(5, 1), new ImmutablePair<>(6, 5));
        expected.put(new ImmutablePair<>(1, 4), new ImmutablePair<>(2, 2));
        expected.put(new ImmutablePair<>(3, -6), new ImmutablePair<>(4, 12));
        return Stream.of(
                Arguments.arguments(expected, Arrays.asList(2, 4, 2, -6, 12, 1, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(Map<Pair, Pair> expected,  List<Integer> dataForTest) {
        Map<Pair, Pair> actual = ex38.doConditional(dataForTest, 6);
        assertEquals(expected, actual);
    }
}