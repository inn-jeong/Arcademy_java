package Chapter03;

import java.util.Scanner;

public class ComputerBalance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		System.out.print("구매 금액을 입력하세요: ");
		int purchaseAmount = scan.nextInt();
		
		if(purchaseAmount >= 300000) {
			balance = purchaseAmount -30000;
		}
		else if(purchaseAmount < 300000 && purchaseAmount >= 100000) {
			balance = purchaseAmount -5000; 
		}
		else balance = purchaseAmount;
		
		System.out.println("구매금액 = "+purchaseAmount);
		System.out.println("청구금액 = "+balance);
		scan.close();
	}
}
