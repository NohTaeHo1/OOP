package strategy;
import java.util.Arrays;
import java.util.function.BiFunction;
enum Operator2 {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    Operator2(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static double calculate2(String operator, double num1, double num2) {
        return getOperator(operator).expression.apply(num1, num2);
    }

    private static Operator2 getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}

public class Calculator2 {
    double calculate2(double a, String operator, double b) {
        return Operator2.calculate2(operator, a, b);
    }

    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        double d = c.calculate2(1,"+", 2);
        System.out.println("Result : "+d);
    }
}