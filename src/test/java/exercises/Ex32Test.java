package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Ex32Test {
    private static Ex32 ex32;

    @BeforeAll
    private static void init() {
        ex32 = new Ex32();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(3, 4, 3, true),
                Arguments.arguments(5, 3, 2, true),
                Arguments.arguments(5, 7, 5, false)
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(int expected, int dataX, int dataY, boolean isCorrext) {
        if (isCorrext) {
            int acual = ex32.doConditional(dataX, dataY);
            assertEquals(expected, acual);
        } else {
            Exception exception = assertThrows(Exception.class, () -> ex32.doConditional(dataX, dataY));
        }
    }
}