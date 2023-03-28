package Chapter05;

import java.util.Scanner;

class Trapazoid{
	int down, up, height;
	
	public Trapazoid(int down, int up, int height) {
		this.down = down;
		this.up = up;
		this.height = height;
	}
//	사다리꼴 넓이 : (윗변+아랫변)*높이/2
	public double getArea() {
		return (up+down)*height/2.0;
	}
}
public class TrapezoidEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		int down = scan.nextInt();
		int up = scan.nextInt();
		int height = scan.nextInt();
		Trapazoid trap = new Trapazoid(down, up, height); //객체 생성
		System.out.println("사다리꼴의 면적은"+trap.getArea()); //객체의 메소드 호출
		scan.close();
		double a = 0.1;
		System.out.println(Double.compare(0.1, 0.1));
	}
}
