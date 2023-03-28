package Chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
//		길이가 5인 배열 생성 
		int[] arr = new int[5];
		int max = 0; //가장 큰 수
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
//			입력받은 수가 현재까지의 가장 큰 수보다 크다면 max 변수에 저장
			if(arr[i] > max) max = arr[i];
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scan.close();
	}
}
