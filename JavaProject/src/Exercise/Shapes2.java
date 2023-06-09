package Exercise;

interface Shape2{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---- 다시 그립니다.");
		draw();
	}
}
class Circle3 implements Shape2{
	int r;
	public Circle3(int r) {
		this.r = r;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+r+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return PI*r*r;
	}
}
class Oval implements Shape2{
	int a,b;
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+a+"x"+b+"에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return a/2.0*b/2.0*PI;
	}
}
class Rect implements Shape2{
	int a,b;
	public Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+a+"x"+b+"크기의 사각형입니다.");
		
	}
	@Override
	public double getArea() {
		return a*b;
	}
}
public class Shapes2{
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3];
		list[0] = new Circle3(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());
	}
}
