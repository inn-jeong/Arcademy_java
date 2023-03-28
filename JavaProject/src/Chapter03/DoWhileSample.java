package Chapter03;

public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c+" ");
//			c+1 => 문자 + 정수 = 정수
//			유니코드 변환해서 1 증가한 유니코드를 문자로 변환해서 변수 c에 저장
			c = (char)(c+1);
//			대입연산자는 연산 과정에서 자동 형 변환이 일어나지 않는다!
//			c += 1; //? 얘는 캐스팅 오류가 나지 않음
		} while (c <= 'z');
	}
}
