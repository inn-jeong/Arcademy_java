package Chapter05;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override //@는 어노테이션(시스템 주석)
	public void draw() {//오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape {
//	어노테이션이 없어도 문제 없음
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	String name;
	public void draw() {
		name = "Circle";
		super.draw();
		System.out.println("Circle");
	}
}
public class MethodOverridingEx {
//	Shape p = new Line(); //upcasting이 일어남
//	Shape p = new Shape();
//	Shape p = new Line(); //upcasting이 일어남
//	Shape p = new Rect(); //upcasting -> overriding
	static void paint(Shape p) {
//		업캐스팅에 의해서 슈펴클래스의 draw() 메소드로 갔다가 오버라이딩 되어서 Line으로 간다.
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); //동적 바인딩이 일어남
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
