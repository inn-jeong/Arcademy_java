package Chapter02;

public class Square {
//	void: 리턴 타입(리턴할 값이 없다)
	public static void main(String[] args) {
		int n=4;
//		n의 제곱을 s로 저장
		int s = sqare(n);
		System.out.println("한변의 길이가 "+n+"인 정사각형의 넓이: "+s);
//		return; 오류 발생은 안 함(생략가능)
	}
//	square: 메소드명
//	int length: int 타입의 매개변수(인자, 파라미터)
	public static int sqare(int length) {
//		값을 할당하지 않거나 return 하지 않으면 오류 발생
//		매개변수로 받은 값을 제곱해서 반환
		return length * length;
//		return 타입이 void가 아닐 경우 리턴 값이 있어야 함
//		return 0;
	}
}
