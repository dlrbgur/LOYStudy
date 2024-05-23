import java.util.Random;
import java.util.Scanner;

public class plus_3 {
    int[] num1 = new int[10];
    int[] num2 = new int[10];
    int[] answer1 = new int[10];
    int[] wrong=new int[10];
    int count=0;
    Scanner sc=new Scanner(System.in);

    public void plus_3_makegame(){
        System.out.println("덧셈을 푸시오.");
        Random random=new Random();
        String retry;
        for(int i = 0; i < 10; i++) {
            num1[i] = random.nextInt(90) + 10;
            num2[i] = random.nextInt(90) + 10;
            answer1[i] = num1[i] + num2[i];
        }
        for(int i=0;i<10;i++){
            System.out.print(num1[i]+"+"+num2[i]+"=?");
            int cap=sc.nextInt();
            if(answer1[i]==cap){
                System.out.println("정답입니다.");
            }else {
                System.out.println("틀렸습니다");
                wrong[i]+=1;
                count+=1;
            }
        }
    }

    public void plus_3_printresult(){
        System.out.print(count+"개 틀렸습니다.");
    }

    public void plus_3_printMistake(){
        for(int j=0;j<10;j++){
            if(wrong[j]!=0){
                System.out.println(num1[j]+"+"+num2[j]+"="+"의 답은");
                System.out.println(answer1[j]+"입니다.");
            }
        }
    }

    public static void main(String[] args) {
        plus_3 game = new plus_3();
        Scanner sc_1 = new Scanner(System.in);
        String retry;
        while(true){
            game.plus_3_makegame();
            game.plus_3_printresult();
            game.plus_3_printMistake();
            System.out.println("다시 덧셈게임을 시작하시겠습니까? Y/N");
            sc_1.nextLine();
            retry=sc_1.nextLine();
            if(retry.equals("Y")){
                System.out.println("다시 실행");
            }else{
                break;
            }
        }
    }
}
