package Chapter02;

import java.util.Scanner;
/*
 * 점수를 입력받아 출력
 * */
public class GradingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		A,B,C,D,F
		char grade;
		System.out.print("점수를 입력하시오(0~100): ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10:
//			break가 없어 case 10과 case 9가 같은 결과를 출력 
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
//		전에 작성한 코드는 주석처리
		/*
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
		*/
		System.out.println("학점은 "+grade+" 입니다.");
		sc.close();
	}
}
