package Chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dollar = 0;
		int won = 0;
		System.out.print("가구수를 입력하시오>> ");
		int familly = scan.nextInt(); // 가구스

		if(familly == 1) won = 40; 		// 1인 가구
		else if(familly == 2) won = 60; // 2인 가구
		else if(familly == 3) won = 80; // 3인 가구
		else won = 100;					// 4인 이상 가구 
		won *= 10000;					// 만원 단위를 원으로 변환
		dollar = won/1200;				// 달러 환전
//		100달러권으로 변환 가능하다면
		if(dollar / 100 != 0) {
			System.out.println("100달러짜리 "+dollar/100+"매");
			dollar %= 100;
		}
//		나머지 달러를 10달러권으로 변환 가능하다면
		if(dollar /10 != 0) {
			System.out.println("10달러짜리 "+dollar/10+"매");
		}
		scan.close();
	}
}
