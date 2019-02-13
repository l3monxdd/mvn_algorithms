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

class Ex28Test {

    private static Ex28 ex28;

    @BeforeAll
    private static void init() {
        ex28 = new Ex28();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(new ArrayList<>(Arrays.asList(4.0F, 5.0F, 5.5F, 10.0F)),
                        new ArrayList<>(Arrays.asList(4.0F, 5.0F, 10.0F)), 5.5F),
                Arguments.arguments(new ArrayList<>(Arrays.asList(4.0F, 5.0F, 5.5F, 5.5F, 10.0F)),
                        new ArrayList<>(Arrays.asList(4.0F, 5.0F, 5.5F, 10.0F)), 5.5F),
                Arguments.arguments(new ArrayList<>(Arrays.asList(4.0F, 4.0F, 5.0F, 6.0F)),
                        new ArrayList<>(Arrays.asList(4.0F, 5.0F, 6.0F)), 4.0F)
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(List<Float> expected, List<Float> data, float b) {
        List<Float> actual = ex28.doConditional(data, b);
        assertEquals(expected, actual);
    }
}