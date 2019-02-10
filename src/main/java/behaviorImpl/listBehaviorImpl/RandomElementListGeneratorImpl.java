package behaviorImpl.listBehaviorImpl;

import behavior.listBehavior.RandomElementListGenerator;

import java.util.ArrayList;
import java.util.List;

public class RandomElementListGeneratorImpl implements RandomElementListGenerator {
    @Override
    public List<Integer> randomList(int size, int min, int max) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int random = (int) Math.round(Math.random() * ((max - min))) + min;
            elements.add(random);
        }
        return elements;
    }
}
