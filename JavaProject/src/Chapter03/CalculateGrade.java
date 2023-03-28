package Chapter03;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		String grade = "";
		Scanner scan = new Scanner(System.in);
		int k = 0100;
		System.out.println(k);
		System.out.print("부정행위 여부(true 혹은 false): ");
		String cheating = scan.next();
		System.out.print("출석률(0~100사이의 정수값): ");
		int attendrate = scan.nextInt();
		System.out.print("총점(0~199사이의 정수값): ");
		int totalscore = scan.nextInt();
//		부정행위가 "true"이고 출석률이 80 미만이라면 "F" 학점
		if(cheating.equals("true") || attendrate < 80) grade = "F";
//		부정행위를 하지 않았다면 (cheating = "false") 출석률이 80이상이라면
		else {
			if(totalscore >= 90) grade = "A";
			else if(totalscore >= 80) grade = "B";
			else if(totalscore >= 70) grade = "C";
			else if(totalscore >= 60) grade = "D";
			else grade = "F";

		}
		System.out.println("학점 = "+grade);
		
		scan.close();
	}
}
