package Chapter03;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("연산>> ");
		int a = scan.nextInt();
		String c = scan.next();
		int b = scan.nextInt();
		int answer = 0;
		/*
		switch(c) {
		case "+":
			System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,a+b);
			break;
		case "-":
			System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,a-b);
			break;
		case "*":
			System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,a*b);
			break;
		case "/":
			switch(b) {
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			default:
				System.out.printf("%d%s%d의 계산 결과는 %.3f",a,c,b,(double)a/b);
			}
			break;
		default:
			System.out.println("사직 연산이 아닙니다.");
		}
	*/
		switch(c) {
		case "+":
			answer = a + b;
			break;
		case "-":
			answer = a - b;
			break;
		case "*":
			answer = a * b;
			break;
		case "/":
			switch(b) {
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			default:
				System.out.printf("%d%s%d의 계산 결과는 %.3f",a,c,b,(double)a/b);
				return;
			}
		default:
			System.out.println("사직 연산이 아닙니다.");
			return;
		}
		System.out.printf("%d%s%d의 계산 결과는 %d",a,c,b,answer);
		scan.close();
	}
}
