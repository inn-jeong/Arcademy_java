package Chapter03;

public class Ex3_7 {
	public static void main(String[] args) {
		int[] evens = {0,2,4,6,8,10,12,14,16,18};
		int[] primes = {2,3,5,7,11,13,17,19};
		
//		1. 짝수배열을 메소드 매개변수로 호풀
//		sum(evens);
//		sum(evens[]); //오류
//		5.합계를 받아서 evenSum에 저장
		int evenSum = sum(evens);
		int primeSum = sum(primes);
		System.out.println("짝수 배열의 합: "+evenSum);
		System.out.println("솟수 배열의 합: "+primeSum);
	}
	
//	2. arr 로 evens 를 받는다.
	public static int sum(int[] arr) {
		int sum = 0;
		
//		매개변수 배열의 크기만큼 반복하면서 sum에 합계를 누적
//		3. arr 배열 원소를 가지고 반복(0,2,4,6,8,10,12,14,16,18)해서 합계 구함
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		4. 합계를 반환
		return sum;
	}
}
