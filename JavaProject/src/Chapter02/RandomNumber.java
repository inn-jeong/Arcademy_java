package Chapter02;

public class RandomNumber {
	public static void main(String[] args) {
//		오류 발생 - 리턴타입은 int인데 받는 타입은 String이므로 타입이 달라 오류 발생
//		리턴타입과 받는 변수 타입이 일치해야 함
//		String n = rollDice();
		int n = rollDice();
		System.out.println("주사위의 눈: "+n);
	}
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
	public static int rollDice() {
//		Math.random : 0이상 1미만 난수 발생
//		Math.random();
//		0이상 6미만의 난수 발생(소수점) -> double로 받아야 함
		double x = 6 * Math.random();
//		(int)x -> 0~5 의 난수
		int temp = (int)x;
//		temp+1 -> 1~6 의 난수
//		1~6 의 난수 반환
		return temp += 1;
	}
}
