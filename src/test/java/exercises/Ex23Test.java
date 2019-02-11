package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex23Test {
    static private Ex23 ex23;

    @BeforeAll
    static void init() {
        ex23 = new Ex23();
    }

    static Stream<Arguments> doConditionalDataProvider() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(0, 0, 0, 1, 1, 1), Arrays.asList(0, 1, 1, 0, 1, 0)),
                Arguments.arguments(Arrays.asList(0, 0, 1, 1, 1, 1), Arrays.asList(1, 1, 1, 0, 1, 0)),
                Arguments.arguments(Arrays.asList(0, 0, 0, 0, 1, 1), Arrays.asList(1, 0, 1, 0, 0, 0))
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalDataProvider")
    void doCondition(List<Integer> expected, List<Integer> listForTest) {
        final int min = 0;
        final int max = 1;

        listForTest.forEach(integer -> {
            assertThat(min, lessThanOrEqualTo(integer));
            assertThat(max, greaterThanOrEqualTo(integer));
        });

        List<Integer> actual = ex23.doCondition(listForTest);
        assertEquals(expected, actual);
    }


    @Test
    void getRandomElements() {
        Ex23 ex23 = new Ex23();
        List<Integer> integers = ex23.getRandomElements(10, 0, 1);
        integers.forEach(i -> System.out.print("\t" + i));
    }


}