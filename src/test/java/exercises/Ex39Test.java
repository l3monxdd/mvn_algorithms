package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex39Test {

    private static Ex39 ex39;

    @BeforeAll
    private static void init() {
        ex39 = new Ex39();
    }

    private static Stream<Arguments> dataForTest() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(3.0, 4.75, 5.0, 8.0), Arrays.asList(3.0, 3.0, 5.0, 8.0)),
                Arguments.arguments(Arrays.asList(3.0, 3.0, 4.4, 5.0, 8.0), Arrays.asList(3.0, 3.0, 3.0, 5.0, 8.0))
        );
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    void doConditional(List<Double> expected, List<Double> dataForTest) {
        List<Double> actual = ex39.doConditional(dataForTest);
        assertEquals(expected, actual);
    }
}