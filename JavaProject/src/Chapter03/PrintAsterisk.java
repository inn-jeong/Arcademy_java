package Chapter03;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오>> ");
		int num = scan.nextInt();
//		num이 0이 아니면 계속 반복
		while(num != 0) {
//			num 횟수만큼 "*" 출력
			for(int i=0; i<num; i++)System.out.print("*");
//			줄바꿈
			System.out.println();
			num--;
		}
		scan.close();
	}
}
