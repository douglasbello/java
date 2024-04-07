package predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void example() {
        List<Integer> ages = List.of(17, 18, 19, 28, 18, 28, 46, 7, 8, 9);

        NotLessThan18<Integer> isAdult = new NotLessThan18<>();

        ages.stream().filter(isAdult).forEach(System.out::println);
    }

    public static void andExample() {
        Predicate<Integer> adultYet = i -> i >= 18;
        Predicate<Integer> adultStill = i -> i < 65;
        System.out.println(adultYet.and(adultStill).test(5));
        System.out.println(adultYet.and(adultStill).test(38));
        System.out.println(adultYet.and(adultStill).test(90));
    }

    public static void orExample() {
        Predicate<String> containsA = t -> t.contains("crayon");
        Predicate<String> containsB = t -> t.contains("my");
        System.out.println(containsA.or(containsB).test("here is my crayon"));
        System.out.println(containsA.or(containsB).test("here is my pencil"));
        System.out.println(containsA.or(containsB).test("here is John's crayon"));
        System.out.println(containsA.or(containsB).test("here is John's pencil"));
    }

    public static void negateExample() {
        NotLessThan18<Integer> isAdult = new NotLessThan18<>();
        Predicate<Integer> isChild = isAdult.negate();

        List<Integer> ages = List.of(17, 18, 19, 28, 18, 28, 46, 7, 8, 9);

        ages.stream().filter(isChild).forEach(System.out::println);
    }

    public static void equalExample() {
        Predicate<String> i = Predicate.isEqual("here is my crayon");
        System.out.println(i.test("here is my pencil"));
        System.out.println(i.test("here is my crayon"));
    }
}
