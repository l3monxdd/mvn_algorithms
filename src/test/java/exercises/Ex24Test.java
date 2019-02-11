package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex24Test {
    private static Ex24 ex24;

    @BeforeAll
    private static void init() {
        ex24 = new Ex24();
    }

    static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(0, 0, 3, 0), Arrays.asList(-7, -5, 3, 0)),
                Arguments.arguments(Arrays.asList(0, -3, 6, -2), Arrays.asList(-9, -3, 6, -2)),
                Arguments.arguments(Arrays.asList(0, 0, 1, 0), Arrays.asList(-8, -3, 1, -2))
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(List<Integer> expected, List<Integer> listForTest) {
        List<Integer> actual = ex24.doConditional(listForTest);
        assertEquals(expected, actual);
    }


}