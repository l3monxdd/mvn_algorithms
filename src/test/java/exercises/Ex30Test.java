package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Ex30Test {
    private static Ex30 ex30;

    @BeforeAll
    private static void init() {
        ex30 = new Ex30();
    }

    private static Stream<Arguments> doConditionData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(10, 8, 14, 12), Arrays.asList(10, 8, 14, 12, 3, 3), true),
                Arguments.arguments(Arrays.asList(10, 8, 14, 12, 3, 3), Arrays.asList(10, 8, 2, 14, 12, 3, 3), true),
                Arguments.arguments(Arrays.asList(), Arrays.asList(), false)
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionData")
    void doConditional(List<Integer> expected, List<Integer> dataForTest, boolean isCorrect) {
        if (isCorrect) {
            List<Integer> actual = ex30.doConditional(dataForTest);
            assertEquals(expected, actual);
        } else {
            Exception exception = assertThrows(Exception.class, () -> ex30.doConditional(dataForTest));
        }
    }
}