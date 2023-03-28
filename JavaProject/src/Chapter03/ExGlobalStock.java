package Chapter03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요: ");
		int buy = scan.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int sale = scan.nextInt();
		double yang = 0;
		if(sale > buy) {
			yang = (sale - buy) * 22/100.0;
		}
		else {
			yang = 0;
		}
		System.out.println("양도세 = "+yang);
		scan.close();
	}
}
