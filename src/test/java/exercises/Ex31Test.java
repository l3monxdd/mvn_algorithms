package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Ex31Test {
    private static Ex31 ex31;

    @BeforeAll
    private static void init() {
        ex31 = new Ex31();
    }

    private static Stream<Arguments> doConditionData() {
        return Stream.of(
                Arguments.arguments(10, 7),
                Arguments.arguments(10, 3),
                Arguments.arguments(3, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionData")
    void doConditional(int n, int c) {
        if (n >= c) {
            int an = 1 + (c - 1) * 1;
            int expected = (1 + an) / 2 * c;
            int actual = ex31.doConditional(n, c);
            assertEquals(expected, actual);
        } else {
            Exception exception = assertThrows(Exception.class, () -> ex31.doConditional(n, c));
        }
    }
}