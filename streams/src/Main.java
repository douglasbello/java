import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        int answer = s.calculate(a);
        System.out.println(answer);

    }
}