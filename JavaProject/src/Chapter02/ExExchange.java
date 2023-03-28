package Chapter02;
import java.util.Scanner;
public class ExExchange {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		달러 환율
		final double RATE_DOLLAR = 1200.0;
//		유로 환율
		final double RATE_EUR = 1500.0;
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = sc.nextInt();
//		원화를 달러로 환전
		double dollar = won/RATE_DOLLAR;
//		원화를 유로로 환전
		double eur = won/RATE_EUR;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		System.out.println(won+"원은 E"+eur+"입니다.");
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = sc.nextInt();
//		입력받은 원화를 달러로 환전한 값을 저장
		double wonDollar = wonDollar(won);
//		입력받은 원화를 유로로 환전한 값을 저장
		double wonEur = wonEur(won);

		System.out.println(won+"원은 $"+wonDollar+"입니다.");
		System.out.println(won+"원은 E"+wonEur+"입니다.");
	}
	public static double wonDollar(int won) {
//		달러 환율(고정)
		final double RATE_DOLLAR = 1200.0;
//		달러로 환전한 값을 반환
		return won/RATE_DOLLAR;
	}
	public static double wonEur(int won) {
//		유로 환율(고정)
		final double RATE_EUR = 1500.0;
//		유로로 환전한 값을 반환
		return won/RATE_EUR;
		
	}
}
