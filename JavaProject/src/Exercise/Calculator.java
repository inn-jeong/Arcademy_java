package Exercise;

import java.util.Scanner;

abstract class Calc2{
	int a,b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract public int calculate();
}
class Add2 extends Calc2{
	@Override
	public int calculate() {
		return a+b;
	}
}
class Sub2 extends Calc2{
	@Override
	public int calculate() {
		return a-b;
	}
}
class Mul2 extends Calc2{
	@Override
	public int calculate() {
		return a*b;
	}
}
class Div2 extends Calc2{
	@Override
	public int calculate() {
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		else return a/b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		Calc2 exp = null;
		switch(c){
		case '+':exp = new Add2();break;
		case '-':exp = new Sub2();break;
		case '*':exp = new Mul2();break;
		case '/':exp = new Div2();break;
		default:
			System.out.println("잘못된 연산자입니다.");
			sc.close();
			return;
		}
		exp.setValue(a, b);
		if(exp instanceof Div2 && b == 0) {
			System.out.println("계산할 수 없습니다.");
		} else {
			//오버라이딩에 의한 동적바인딩
			System.out.println(exp.calculate());
		}
		sc.close();
	}
}
