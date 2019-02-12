package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex25Test {

    private static Ex25 ex25;

    @BeforeAll
    private static void init() {
        ex25 = new Ex25();
    }

    private static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.arguments(13, Arrays.asList(2, 5, 8, 0)),
                Arguments.arguments(11, Arrays.asList(8, 8, 4, 6, 3, 2)),
                Arguments.arguments(6, Arrays.asList(3, 5, 2, 1, 1, 3))
        );
    }


    @ParameterizedTest
    @MethodSource("getData")
    void doConditional(int expected, List<Integer> dataForTest) {
        int actual = ex25.doConditional(dataForTest);
        assertEquals(expected, actual);

    }
}