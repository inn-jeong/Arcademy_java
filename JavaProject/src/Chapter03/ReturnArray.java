package Chapter03;
/*
 * 배열 리턴(메소드 이용)
 * */
public class ReturnArray {
//	makeArray() : 메소드
//	int[] : 반환(리턴) 타입(리턴을 안 하면 오류)
//	리턴 타입에 배열 크기를 표시하면 오류
//	static int[4] makeArray() {
	static int[] makeArray() {
//		선언한 타입과 생성하는 타입이 맞지 않으면 오류 발생.
//		int temp[] = new String[4];
		int temp[] = new int[4];
		
//		temp.length : 4
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;// 0 1 2 3
		}
//		리턴 타입과 반환되는 값의 타입이 일치해야 함
//		리턴할때 []를 추가하면 오류
//		return temp[];
		return temp;//0 1 2 3
	}
	public static void main(String[] args) {
		int intArray[];
//		메소드 호출
		intArray = makeArray(); // temp 배열 받음 //0 1 2 3
		for(int i:intArray)System.out.print(i+" ");
	}
}
