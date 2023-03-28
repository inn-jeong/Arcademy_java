package Chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오 >> ");
//		입력 받음과 동시에 520을 곱해 매수를 달러로 변환
		int dollar = scan.nextInt() * 520;
		
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
