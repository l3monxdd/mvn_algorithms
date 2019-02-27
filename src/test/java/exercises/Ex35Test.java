package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex35Test {

    private static Ex35 ex35;

    @BeforeAll
    private static void init() {
        ex35 = new Ex35();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(new ArrayList<>(Arrays.asList(1, 3, 5)), new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))),
                Arguments.arguments(new ArrayList<>(Arrays.asList(10, 15, 0)), new ArrayList<>(Arrays.asList(10, 4, 15, 0, 0, 6)))
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(List<Integer> expected, List<Integer> dataForTest) {
        List<Integer> actual = ex35.doConditional(dataForTest);
        assertEquals(expected, actual);
    }
}