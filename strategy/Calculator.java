package strategy;

import java.util.Scanner;

public class Calculator {

    public static int calculate(int a, int b, Operator opcode){
        int c = 0;
        c = opcode.apply(a, b);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 정수 연산자 ");
        System.out.println(Calculator.calculate(sc.nextInt(), sc.nextInt(), Operator.valueOf(sc.next())));
    }
}