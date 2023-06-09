package Chapter05;

class OuterClass{//외부 클래스
	private String secret = "Time is money";
	public OuterClass() {//2.달걀의 생성자 호출
//		new InnerClass();//3.노른자 객체 생성
		InnerClass obj = new InnerClass();
		obj.method();//a.
	}
	private class InnerClass{//내부(중첩 or Inner) 클래스
		public InnerClass() {//4.노른자 생성자 호출
			System.out.println("내부 클래스의 생성자 입니다.");
		}
		//b.
		public void method() {
			//노른자에서 달걀의 private 접근
			//c.
			System.out.println(secret);
		}
	}
}
public class OuterClassTest {
	public static void main(String[] args) {
//		private을 안 해도 접근 제한
//		new InnerClass();//접근 제한, 노른자 객체 생성(오류)
//		new OuterClass();//1.달걀 객체 생성
		OuterClass outer = new OuterClass();
//		outer.secret; // 접근제한(private)
	}
}
