package Chapter03;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int res = 0;
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		System.out.print("금액을 입력하시오>> ");
		int money = scan.nextInt();
		res = money/오만원;
		if(res > 0) {
			System.out.println("오만원권 "+res+"매");
		}
		
		money %= 오만원;
		res = money/만원;
		if(res > 0) {
			System.out.println("만원권 "+res+"매");
		}
		
		money %= 만원;
		res = money/천원;
		if(res > 0) {
			System.out.println("천원권 "+res+"매");
		}
		
		money %= 천원;
		res = money/오백원;
		if(res > 0) {
			System.out.println("오백원 "+res+"개");
		}
		
		money %= 오백원;
		res = money/백원;
		if(res > 0) {
			System.out.println("백원 "+res+"개");
		}
		
		money %= 백원;
		res = money/오십원;
		if(res > 0) {
			System.out.println("오십원 "+res+"개");
		}
		
		money %= 오십원;
		res = money/십원;
		if(res > 0) {
			System.out.println("십원 "+res+"개");
		}
		
		money %= 십원;
		res = money/일원;
		if(res > 0) {
			System.out.println("일원 "+res+"개");
		}
		
		/*
		while(money != 0) {
			if(money/50000 != 0) {
				System.out.println("오만원권 "+money/50000+"매");
				money %= 50000;
			}
			else if(money/10000 != 0) {
				System.out.println("만원권 "+money/10000+"매");
				money %= 10000;
			}
			else if(money/1000 != 0) {
				System.out.println("천원권 "+money/1000+"매");
				money %= 1000;
			}
			else if(money/100 != 0) {
				System.out.println("백원 "+money/100+"개");
				money %= 100;
			}
			else if(money/50 != 0) {
				System.out.println("오십원 "+money/50+"개");
				money %= 50;
			}
			else if(money/10 != 0) {
				System.out.println("십원 "+money/10+"개");
				money %= 10;
			}
			else{
				System.out.println("일원 "+money+"개");
				money /= 10;
			}
		}*/
	}
}
