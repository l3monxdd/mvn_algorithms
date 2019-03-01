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

class Ex37Test {

    private static Ex37 ex37;

    @BeforeAll
    private static void init() {
        ex37 = new Ex37();
    }

    private static Stream<Arguments> doConditionalData() {
        return Stream.of(
                Arguments.arguments(new ArrayList<>(Arrays.asList(0, 2, 4, 6)), new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6)), "even"),
                Arguments.arguments(new ArrayList<>(Arrays.asList(14, 2, 9, 26)), new ArrayList<>(Arrays.asList(14, 5, 2, 1, 9, 12, 26)), "even"),
                Arguments.arguments(new ArrayList<>(Arrays.asList(1, 3, 5)), new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6)), "odd"),
                Arguments.arguments(new ArrayList<>(Arrays.asList(8, 12, 17)), new ArrayList<>(Arrays.asList(5, 8, 4, 12, 6, 17, 34)), "odd")
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalData")
    void doConditional(List<Integer> expected, List<Integer> dataForTest, String check) {

        List<Integer> actualEvenNumbers = new ArrayList<>();
        List<Integer> actualOddNumbers = new ArrayList<>();

        if (check.equals("even")) {
            ex37.doConditional(dataForTest, actualEvenNumbers, actualOddNumbers);
            assertEquals(expected, actualEvenNumbers);
        } else {
            ex37.doConditional(dataForTest, actualEvenNumbers, actualOddNumbers);
            assertEquals(expected, actualOddNumbers);
        }

    }
}