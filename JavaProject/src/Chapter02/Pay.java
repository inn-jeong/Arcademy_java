package Chapter02;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
		final int RATE = 1000; //1시간 임금
		int pay; //1시간 임금을 시간에 곱한 값
		int hours; //일한 시간
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하시오: ");
		hours = sc.nextInt();
		
//		8시간 이하: 1시간 임금 * 시간
//		8시간 초과: 1시간 임금 * 시간 * 1.5
		if(hours > 8) {
//			1.5를 곱해주어 double타입으로 연산하므로 int타입으로 캐스팅해준다.
			pay = (int)(RATE * 8 + (1.5 * RATE * (hours-8)));  
		}else {
			pay = RATE * hours;
		}
		System.out.println("임금은"+pay+"원 입니다.");
	}
}
