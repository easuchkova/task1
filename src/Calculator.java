import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    /**
     * BinaryOperator<Integer> devide = (x, y) -> x / y; возникает проблема при попытке деления на 0 (y = 0)
     * на входе необходимо проверить не является ли делитель равным нулю. Если делитель равен нулю - можно выдать ошибку
     * и/или принудительно выдать ноль. Выбор одного из вариантов может быть сделан в соответствии с целью задачи.
     * Здесь перепишем операцию деления так, чтобы в случае деления на 0 ответ был 07
     */
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
