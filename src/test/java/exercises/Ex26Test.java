package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex26Test {

    private static Ex26 ex26;

    @BeforeAll
    private static void init() {
        ex26 = new Ex26();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments("positive > negative", Arrays.asList(-3, 4, -8, 7)),
                Arguments.arguments("negative > positive", Arrays.asList(-3, 4, -8, 4)),
                Arguments.arguments("equal", Arrays.asList(-2, 4, -8, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(String expected, List<Integer> listForTest) {

        String actual = ex26.doConditional(listForTest);
        assertEquals(expected, actual);

    }
}