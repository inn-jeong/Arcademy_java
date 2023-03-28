package Chapter03;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String bool = "불합격";
		System.out.print("점수를 입력하세요(0~100): ");
//		점수 입력
		int score = scan.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
//		학년 입력
		int grade = scan.nextInt();
		if(grade == 4) {
//			4학년이면서 70점 이상이면 합격
			if(score >= 70) bool = "합격";
		}
		else {
//			4학년이 아니며 60점 이상이면 합격
			if(score >= 60) bool = "합격";
		}
		System.out.println(bool);
		scan.close();
	}
}
