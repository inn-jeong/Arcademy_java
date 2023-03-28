package Chapter03;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
//		길이가 5인 배열 생성 
		int[] arr = new int[5];
		int sum = 0; //합계
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		sum/arr.length : 합계/정수의 갯수
//		정수/정수 라 소수점 아래 자리가 잘려 분자를 double로 캐스팅해주었다.
		double avg = (double)sum/arr.length;
		System.out.println("평균은 "+avg);
		scan.close();
	}
}
