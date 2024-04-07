package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AndThenExample {

    public static void example() {

        // consumer que multiplica cada elemento por 2 dentro de uma lista de inteiros
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // consumer para fazer a exibição de uma lista de inteiros
        Consumer<List<Integer>> displayList = list -> list.stream().forEach(a -> System.out.println(a));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        modify.andThen(displayList).accept(list);
    }

    public static void nullPointerExample() {
        // consumer que multiplica cada elemento por 2 dentro de uma lista de inteiros
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // consumer para fazer a exibição de uma lista de inteiros
        Consumer<List<Integer>> displayList = list -> list.stream().forEach(a -> System.out.println(a));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        try {
            modify.andThen(null).accept(list);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
