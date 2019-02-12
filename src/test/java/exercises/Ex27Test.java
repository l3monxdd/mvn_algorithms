package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex27Test {

    private static Ex27 ex27;

    @BeforeAll
    private static void innit() {
        ex27 = new Ex27();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(2, 0, 5, 5, 4), Arrays.asList(2, 5, 5, 5, 4)),
                Arguments.arguments(Arrays.asList(2, 4, 0, 7, 4), Arrays.asList(2, 4, 7, 7, 4)),
                Arguments.arguments(Arrays.asList(0, 9, 7, 4), Arrays.asList(9, 9, 7, 4)),
                Arguments.arguments(Arrays.asList(0, 0, 7, 4), Arrays.asList(0, 9, 7, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(List<Integer> expected, List<Integer> dataList) {
        List<Integer> actual = ex27.doConditional(dataList);
        assertEquals(expected, actual);
    }
}