package Chapter13;

interface MyFuntion3{
	void print();
//	String print(String a, String b);
}

public class LambdaEx3 {
	public static void main(String[] args) {
		MyFuntion3 f=()->{System.out.println("Hello");};//람다식 작성
		f.print();//람다식 호출
		f=()->System.out.println("안녕");//람다식 재작성
		f.print();
//		MyFuntion3 f=(a,b)->{return a+"  "+b;};//람다식 작성
//		System.out.println(f.print("a  ","b"));//람다식 호출
	}
}
