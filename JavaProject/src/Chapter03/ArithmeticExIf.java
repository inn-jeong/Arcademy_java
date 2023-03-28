package Chapter03;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산>> ");
		int a = scan.nextInt();
		String c = scan.next();
		int b = scan.nextInt();
		/*
		if(c.equals("+")) answer = a + b;
		else if(c.equals("-")) answer = a-b;
		else if(c.equals("*")) answer = a * b;
//			연산자가 / 일때
		else if(c.equals("/")){
//			b == 0일때
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
//				메소드 종료
				return;
			}
//			b != 0일때
			else {
				System.out.printf("%d %s %d의 계산 결과는 %.4f",a,c,b,(double)a/b);
//				메소드 종료
				return;
			}
		}
		else {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		System.out.printf("%d %s %d의 계산 결과는 %d",a,c,b,answer);
		scan.close();
		*/
		if(c.equals("+")) System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,a+b);
		else if(c.equals("-")) System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,a-b);
		else if(c.equals("*")) System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,a*b);
		else if(c.equals("/")) {
			if(b == 0) System.out.println("0으로 나눌 수 없습니다.");
			else System.out.printf("%d%s%d의 계산 결과는 %.3f",a,c,b,(double)a/b);
		}
		else System.out.println("사직 연산이 아닙니다.");
		scan.close();
	}
}
