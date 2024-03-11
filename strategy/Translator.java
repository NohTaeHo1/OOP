package strategy;

import java.util.Scanner;

public class Translator {
    public static String translate(Trans trans){
        return trans.day();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 영어로 적으세요 ex)thursday");
        System.out.println(Translator.translate(Trans.valueOf(sc.next())));
        //Trans.valueOf(sc.next()) : Trans 타입으로 강제 전환
    }

}
