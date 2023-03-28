package Chapter03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int number = scan.nextInt();
		boolean multiple = false;
		
//		3으로 나눈 나머지가 0 (3의 배수)
		if(number %3 == 0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
//		5로 나눈 나머지가 0 (5의 배수)
		if(number %5 == 0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
//		8로 나눈 나머지가 0 (8의 배수)
		if(number %8 == 0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
		if(multiple == false) System.out.println("어느 배수도 아니다.");
		scan.close();
	}
}
