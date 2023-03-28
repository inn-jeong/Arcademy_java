package Chapter03;

import java.util.Scanner;

public class ArthimeticOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int sec = scan.nextInt();
		int hours = sec/60/60;
		int min = sec/60%60;
		int sec2 = sec%60%60; 
		System.out.printf("%d초는 %d시간, %d분, %d초입니다.",sec, hours, min,sec2);
		scan.close();
	}
}
