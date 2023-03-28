package Chapter05;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance=0;
		
		System.out.print("원금을 입력하세요: ");
		double principal = scan.nextDouble();
		System.out.print("연이율을 입력하세요: ");
		double rate = scan.nextDouble();
		System.out.println("연도수 \t원리금");
		int years=0;
		/*
//		while문 사용 1
		while(true) {
			years++;
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
			if(balance > principal * 2) break;
		}
		
//		while문 사용2
		while(balance<=principal*2) {
			years++;
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		}
		
		for(balance=principal; balance<=principal*2; ) {
			years++;
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		}
		*/
		do {
			years++;
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		} while (balance<=principal*2);
		System.out.println("필요한 연도수"+years);
		scan.close();
	}
}
