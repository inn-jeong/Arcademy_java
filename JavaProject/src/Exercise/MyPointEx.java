package Exercise;

class MyPoint{
	int a,b;
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Point("+a+","+b+")";
	}
	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		MyPoint mypoint = (MyPoint)obj;
		if(this.a == mypoint.a && this.b == mypoint.b) answer = true;
		return answer;
	}
}
public class MyPointEx {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50); 
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		//equals 메소드로 객체 자체를 비교
		//equals 문자열은 내용 비교
		if(p.equals(q))System.out.println("같은 점");
		else System.out.println("다른 점");
	}
}
