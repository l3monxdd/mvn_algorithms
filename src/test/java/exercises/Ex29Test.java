package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex29Test {

    private static Ex29 ex29;

    @BeforeAll
    private static void init() {
        ex29 = new Ex29();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(10, 12, 15), Arrays.asList(10, 8, 12, 15, 18), 3),
                Arguments.arguments(Arrays.asList(18, 20, 24), Arrays.asList(10, 8, 12, 15, 18, 20, 24), 4)
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(List<Integer> expected, List<Integer> dataForTest, int m) {
        List<Integer> actual = ex29.doConditional(dataForTest, m);
        assertEquals(expected, actual);
    }
}