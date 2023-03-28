package Chapter04;

//default 접근지정자
class Calc{
//	public static int abs(int a) {
//	public int abs(int a) {
//	private 접근지정자는 같은 클래스 안에서만 접근 가능
//	private static int abs(int a) {//오류
//	default 접근지정자는 같은 패키지(Chapter04) 안에서만 접근 가능
//	static int abs(int a) {
//	protected 접근지정자는 같은 패키지(Chapter04) 안 + 다른  패키지(상속)에서만 접근 가능
	protected static int abs(int a) {
		return a>0?a:-a; //절대값 반환
	}
	static int max(int a, int b) {
		return a>b?a:b; //둘 중에 큰 수 반환
	}
	public static int min(int a, int b) {
		return a>b?b:a; //둘 중에 작은 수 반환
	}
}
//public 접근지정자
public class CalcEx {
	public static void main(String[] args) {
//		abs : static 멤버로서 객체 생성없이 접근 가능
//		non-static 은 객체 생성해야 접근 가능
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(8,10));
		System.out.println(Calc.min(-3,-8));
	}
}
