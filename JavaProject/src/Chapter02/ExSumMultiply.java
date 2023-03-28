package Chapter02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>> ");
		int num = sc.nextInt();
		
//		100의 자리: 100을 나눈 몫				(num/100)
//		10의 자리: 10을 나눈 몫를 10으로 나눈 나머지	(num/10%10)
//		or 100을 나눈 나머지를 10으로 나눈 몫 결국 같은 뜻 (num%100/10)
//		1의 자리: 10을 나눈 나머지				(num%10)
		System.out.println("100의 자리와 10의 자리의 합은 "+ (num/100 + num/10%10));
		System.out.println("10의 자리와 1의 자리의 곱은 "+ (num/10*num%10));
		sc.close();
	}
}
