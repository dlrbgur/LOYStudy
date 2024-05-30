import java.util.Scanner;

public class plus_4_2 {
    plus_4_1[] questions = new plus_4_1[10];
    int[] wrong = new int[10];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public void plus_4_makegame() {
        System.out.println("덧셈을 푸시오.");
        for (int i = 0; i < 10; i++) {
            questions[i] = new plus_4_1();
        }

        for (int i = 0; i < 10; i++) {
            plus_4_1 question = questions[i];
            System.out.print(question.getNum1() + "+" + question.getNum2() + "=? ");
            int cap = sc.nextInt();
            if (question.check(cap)) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다");
                wrong[i] += 1;
                count += 1;
            }
        }
    }

    public void plus_4_printsum() {
        System.out.print(count + "개 틀렸습니다.");
    }

    public void plus_4_printMistake() {
        for (int j = 0; j < 10; j++) {
            if (wrong[j] != 0) {
                plus_4_1 question = questions[j];
                System.out.println(question.getNum1() + "+" + question.getNum2() + "=" + "의 답은");
                System.out.println(question.getAnswer1() + "입니다.");
            }
        }
    }
}
