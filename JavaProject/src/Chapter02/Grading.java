package Chapter02;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		A,B,C,D,F
		char grade;
		System.out.print("점수를 입력하시오(0~100): ");
		int score = sc.nextInt();
		
		
		if(score >= 90) {
//			90점 이상
			grade = 'A';
		}else if (score >= 80) {
//			80점 이상
			grade = 'B';
		}else if (score >= 70) {
//			70점 이상
			grade = 'C';
		}else if (score >= 60) {
//			60점 이상
			grade = 'D';
		}else {
//			60점 미만
			grade = 'F';
		}
		System.out.println("학점은 "+grade+" 입니다.");
		sc.close();
	}
}
