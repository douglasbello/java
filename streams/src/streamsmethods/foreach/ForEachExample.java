package streamsmethods.foreach;

import java.util.List;

public class ForEachExample {

    public static void example() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream().forEach(System.out::println);
    }
}
