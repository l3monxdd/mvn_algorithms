package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.jupiter.params.provider.Arguments.*;

class Ex22Test {

    static private Ex22 ex22;

    @BeforeAll
    static void init(){
        ex22 = new Ex22();
    }


    static Stream<Arguments> doConditionalDataProvider(){
        return Stream.of(
                arguments(5, Arrays.asList(3, 5, 8, 10, 12), 960, true),
                arguments(10, Arrays.asList(4, 8, 12, 14), 168, true),
                arguments(20, Arrays.asList(4, 8, 12, 14), 0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("doConditionalDataProvider")
    void doConditional(int m, List<Integer> integers, int expectedResult, boolean isCorrect) throws Exception {
        if(isCorrect) {
            integers.forEach(i -> System.out.print("\t" + i));
            Integer actualResult = ex22.doConditional(m, integers);
            assertEquals(expectedResult, actualResult);
            System.out.printf("expectedResult: %d, actualResult: %d %n", expectedResult, actualResult);
        }else {
            Exception exception = assertThrows(Exception.class, () -> ex22.doConditional(m, integers));
        }

    }

    @Test
    void doConditionalExceptionChecker() throws Exception {
        final int m = 10;
        List<Integer> integers = Arrays.asList(4, 5, 7);
        Exception exception = assertThrows(Exception.class, () -> ex22.doConditional(m,integers));
    }






}