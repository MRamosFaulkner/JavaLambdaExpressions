import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public interface SimpleFunction{
        int calc(int a, int b);
    }

    public static void main(String[] args) {
        SimpleFunction add = (a, b) -> {
            int result = a + b;
            return result;
        };

        SimpleFunction multiply = (a, b) -> {
            int result = a * b;
            return result;
        };

        SimpleFunction divide = (a,b) -> {
            int result = a/b;
            return result;
        };


        System.out.println(add.calc(2,4));
        System.out.println(multiply.calc(2,4));
        System.out.println(divide.calc(4,2));

        Function<Integer, Integer>  square = x -> x * x;
        System.out.println(square.apply(7));

        Predicate<String> howLong = (str) -> str.length() > 5;
        System.out.println(howLong.test("Do you want to eat?"));

        Consumer<String> message = m -> System.out.println("noooo more " + m);
        message.accept("noodles");

        Supplier<Double> randomNumbers = () -> Math.random() ;
        System.out.println(randomNumbers.get());

    }


}