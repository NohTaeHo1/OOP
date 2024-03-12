import view.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

enum MainDoor {
    EXIT("x", input -> {
        return;
    }),
    USER("u", sc -> UserView.main(sc)),
    BOARD("b", sc -> BoardView.main()),
    ACCOUNT("a", sc -> AccountView.main(sc)),
    AUTH("au", sc -> AuthView.main(sc)),
    GRADE("g", sc -> GradeView.main(sc)),
    KAUP("k", sc -> KaupView.main(sc));
    private final String key;
    private final Consumer<Scanner> consumer;

    MainDoor(String key, Consumer<Scanner> consumer) {
        this.key = key;
        this.consumer = consumer;
    }

    static void getPage(Scanner sc) {
        getP(sc.next()).consumer.accept(sc);
    }

    private static MainDoor getP(String sc) {
        return Arrays.stream(values()).filter(o -> o.key.equals(sc))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x-EXIT u-USER b-BOARD a-ACCOUT au-AUTH g-GRADE k-KAUP");
        MainDoor.getPage(sc);
    }
}

