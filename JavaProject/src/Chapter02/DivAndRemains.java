package Chapter02;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int num = sc.nextInt();
		
//		조건식 앞자리는 10을 나눈 몫이고 뒷자리는 10을 나눈 나머지이다.
//		10의 자리: 나누기 10을 해서 몫
//		1의 자리: 나누기 10을 해서 나머지
		if(num / 10 == num % 10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		sc.close();
	}
}
