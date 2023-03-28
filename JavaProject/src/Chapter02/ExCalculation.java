package Chapter02;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
//		새로운 Scanner 클래스의 객체를 참조하는 참조변수 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 실수 입력>> ");
//		실수값을 받아 num1에 저장
		double num1 = sc.nextDouble();
//		실수값을 받아 num2에 저장
		double num2 = sc.nextDouble();
		
		System.out.println("두수의 덧셈은"+(num1+num2));
		System.out.println("두수의 뺄셈은"+(num1-num2));
		System.out.println("두수의 곱셈은"+(num1*num2));
		System.out.println("두수의 나눗셈은"+(num1/num2));
		
		sc.close();
	}
}
