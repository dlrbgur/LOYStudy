package Java_Study;
import java.util.Random;
import java.util.Scanner;

    public class plus {
        public static void main(String[] args) {//덧셈게임 만들기
            //규칙 : 10문제 출제 10문제 푼 이후 성적 출력하기
            //임의의 숫자를 출력하고(10~100)까지 답이 맞으면 그대로
            //다만 틀리면 틀렸습니다. 출력하고 틀린문제로 오답노트하기

            System.out.println("덧셈을 푸시오.");
            Random random=new Random();
            Scanner sc=new Scanner(System.in);
            int[] num1 = new int[10];
            int[] num2 = new int[10];
            int[] answer1 = new int[10];
            int[] wrong=new int[10];
            int retry;
            int count=0;
            for(int i = 0; i < 10; i++) {
                num1[i] = random.nextInt(91) + 10;
                num2[i] = random.nextInt(91) + 10;
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
                }}
            System.out.print(count+"개 틀렸습니다.");
            for(int j=0;j<10;j++){
                if(wrong[j]==0){
                }
                else{
                    System.out.println("틀린 문제를 다시 푸십시오.");
                    System.out.println(num1[j]+"+"+num2[j]+"=");
                    int cap1=sc.nextInt();
                    answer1[j] = num1[j] + num2[j];
                    if(cap1==answer1[j]){
                        System.out.println("맞았습니다.");
                    }else{
                        System.out.println("틀렸습니다.");
                    }
                }
            }


        }
    }
