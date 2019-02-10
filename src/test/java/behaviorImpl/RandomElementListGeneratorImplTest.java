package behaviorImpl;

import behaviorImpl.listBehaviorImpl.RandomElementListGeneratorImpl;
import org.junit.jupiter.api.RepeatedTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomElementListGeneratorImplTest {

    @RepeatedTest(5)
    void randomList() {
        final int size = 5;
        final int min = 0;
        final int max = 9;
        RandomElementListGeneratorImpl randomElementListGenerator = new RandomElementListGeneratorImpl();
        List<Integer> integers = randomElementListGenerator.randomList(size, min, max);
        integers.forEach(i -> System.out.print("\t" + i));
        assertEquals(5, integers.size());
        integers.forEach(
                i -> {
                    assertThat(min, lessThanOrEqualTo(i));
                    assertThat(max, greaterThanOrEqualTo(i));
        });
    }
}