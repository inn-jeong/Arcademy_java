package Chapter03;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int income = 0;
		int fare = 0;
//		10번 반복
		for(int i=0; i<10; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = scan.nextInt();
			income += fare;
		}
		System.out.println("총 수입: "+income);
		scan.close();
	}
}
