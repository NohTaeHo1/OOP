package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

enum Grade {
    A(9, () -> "A등급"),
    B(8, () -> "B등급"),
    C(7, () -> "C등급"),
    D(6, () -> "D등급"),
    E(5, () -> "E등급");
    private final int score;
    private final Supplier<String> supplier;

    Grade(int score, Supplier<String> supplier) {
        this.score = score;
        this.supplier = supplier;
    }

    static String getGrade(int score) {
        return getG(score / 10).supplier.get();
    }

    private static Grade getG(int a) {
        return Arrays.stream(values()).filter(o -> o.score <= a)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}

public class GradeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score");
        System.out.println(Grade.getGrade(sc.nextInt()));
    }
}



