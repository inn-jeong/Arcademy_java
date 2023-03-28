package Chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 80점 이상이면 합격
 * */
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		
//		점수가 80점 이상인 경우
		if(score >= 80) {
			System.out.println("합격");
		}
//		점수가 80점 미만인 경우
		else {
			System.out.println("불합격");
		}
		sc.close();
	}
}
