package exercises;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

class Ex21Test {

    @RepeatedTest(10)
    void randArray() {
        final int size = 5;
        final int min = 0;
        final int max = 9;
        Ex21 ex21 = new Ex21();
        final int[] tempArr = ex21.randArray(size, min, max);
        assertEquals(size, tempArr.length);

        for (int i = 0; i < tempArr.length; i++) {
            assertThat(min, lessThanOrEqualTo(tempArr[i]));
            assertThat(max, greaterThanOrEqualTo(tempArr[i]));
        }


        Arrays.stream(tempArr).forEach(i
                -> {
            assertThat(min, lessThanOrEqualTo(i));
            assertThat(max, greaterThanOrEqualTo(i));
        });

        System.out.println();

        //test with collections
        final List<Integer> integers = new ArrayList<Integer>();

        Arrays.stream(tempArr).forEach(i -> integers.add(i));

        assertThat(integers, everyItem(greaterThanOrEqualTo(min)));
        assertThat(integers, everyItem(lessThanOrEqualTo(max)));
        System.out.println();

    }


    @Test
    void doConditional() {
        final int[] arr = {3, 6, 22, 44, 14, 18, 9, 10, 20, 12};
        final int[] expected = {10, 12, 14, 18, 20};
        final int c = 10;
        final int d = 20;
        Ex21 ex21 = new Ex21();
        int[] tempArr = ex21.doConditional(arr, c, d);
        assertArrayEquals(expected, tempArr);

    }
}