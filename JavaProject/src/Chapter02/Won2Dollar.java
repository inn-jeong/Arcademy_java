package Chapter02;

import java.util.Scanner;

public class Won2Dollar {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
//		원화 입력
		int won = sc.nextInt();
//		wonDollar 메소드를 호출하여 환율에 따라 달러를 계산하여 출력
		System.out.println(won+"원은 "+"$"+wonDollar(won)+"입니다.");
		sc.close();
		
	}
	public static double wonDollar(int won) {
//		$1 = 1100원
		double Dollar = won/1100;
//		달러 반환
		return Dollar;
	}
	*/
	public static void main(String[] args) {
//		double rate = 1100.0;
//		환율 고정할때 상수 사용(관습적으로 대문자)
		final double RATE = 1100.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >>");
		int won = sc.nextInt();
//		double, int 계산 결과를 double 로 받음
		double dollar = won/RATE;
		System.out.println(won+"원은 "+"$"+dollar+"입니다.");
		sc.close();
	}
}
