package asd;
import java.util.Random;
import java.util.Scanner;
public class practice_0413 {
    public static void main(String[] args) {//덧셈게임 두자리 정수를 생성해서(랜덤생성)덧셈 문제를 출제하고
        // 사용자가 입력한 답과 정답이 맞으면 '맞았습니다.' 틀리면 '틀렸습니다.'로 출력하는 프로그램
        //예시)출력1. 20+30=50 ->50은 사용자가 입력 맞았습니다.아사나 관리툴 쓰기(캡스톤)
        while(true) {
            System.out.println("덧셈게임입니다. 두 숫자의 합을 입력하시오.");
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            int random = 0;
            int rand = rd.nextInt(100);
            int rand1 = rd.nextInt(100);
            random += rand + rand1;
            System.out.print(rand + "+" + rand1 + "=" + "몇일까요??");
            int delete = sc.nextInt();
            String retry;
            if (delete == random) {
                System.out.println("정답입니다.");
                System.out.println("다시할려면 다시할래 라고 입력하세요.");
                retry = sc.nextLine();
                if(retry.equals("다시할래")) {
                    continue;
                }
                else
                    break;
            }
            else {
                System.out.println("틀렸습니다.");
                System.out.println("다시할려먼 '다시' 라고 입력하세요");
                retry = sc.nextLine();

                if (retry.equals("다시"))
                    continue;
                else
                    break;
            }
        }
    }
}