package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AcceptExample {
    public static void display() {
        Consumer<Integer> display = a -> System.out.println(a);

        display.accept(10);
    }

    public static void modify() {
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        Consumer<List<Integer>> displayList = list -> list.stream().forEach(a -> System.out.println(a));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        modify.accept(list);

        displayList.accept(list);
    }
}