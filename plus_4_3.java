import java.util.Scanner;

public class plus_4_3 {
    public static void main(String[] args) {
        plus_4_2 game = new plus_4_2();
        Scanner sc_1 = new Scanner(System.in);
        String retry;
        while (true) {
            game.plus_4_makegame();
            game.plus_4_printsum();
            game.plus_4_printMistake();
            System.out.println("다시 덧셈게임을 시작하시겠습니까? Y/N");
            retry = sc_1.nextLine().trim();
            if (retry.equalsIgnoreCase("Y")) {
                System.out.println("다시 실행");
            } else {
                break;
            }
        }
    }
}
