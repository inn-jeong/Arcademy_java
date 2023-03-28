package Chapter04;

public class Circle {
	int radius; //멤버변수(필드)
	String name;
	Circle c;
//	오버로딩
	public Circle() {} //생성자(기본)
	public Circle(int a) {
		this.radius = a;
	} //생성자(매개변수 1개)
	public Circle(int a, int c) {} //생성자(매개변수 2개)
	public double getArea() {//멤버함수(메소드)
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; //참조변수(태명 비슷) 선언, Circle 이 클래스(객체를 생성하는 틀/판)
//		new Circle(); 
		pizza = new Circle(); //객체 생성 //이름 있는 피자
//		pizza.c = new Circle();
//		pizza.c.name = "도미노";
//		System.out.println(pizza.c.name);
//		pizza.c.c = new Circle();
		pizza.radius = 10; //멤버변수 값 셋팅
		pizza.name = "자바피자"; //멤버변수 값 셋팅
		double area = pizza.getArea(); //멤버함수 호출
		System.out.println(pizza.name+"의 면적은 "+area);//멤버변수 값 사용
		
		Circle donut = new Circle();//객체 생성 //이름있는 도넛
		donut.radius = 2;
		donut.name = "자바도넛";
		int area1 = (int)donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area1);
	}
}
