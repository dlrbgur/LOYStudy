import java.util.Random;

public class plus_4_1 {
    private int num1;
    private int num2;
    private int answer1;

    public plus_4_1() {
        Random random = new Random();
        this.num1 = random.nextInt(90) + 10;
        this.num2 = random.nextInt(90) + 10;
        this.answer1 = num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getAnswer1() {
        return answer1;
    }

    public boolean check(int userAnswer) {
        return userAnswer == answer1;
    }
}
