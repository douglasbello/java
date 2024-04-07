package predicate;

import java.util.function.Predicate;

public class NotLessThan18<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
        Integer adultAge = 18;
        return value >= adultAge;
    }
}
