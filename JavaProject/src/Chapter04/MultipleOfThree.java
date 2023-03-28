package Chapter04;

import java.util.Scanner;

//public class MultipleOfThree {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[10];
//		System.out.print("양의 정수 10개를 입력하시오>> ");
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = scan.nextInt();
////			처음 입력때만 "3의 배수는" 이라는 문자열 출력
//			if(i==0) System.out.print("3의 배수는 ");
////			이후에 3의 배수인 값을 출력
//			if(arr[i]%3==0)System.out.print(arr[i]+" ");
//		}
//		scan.close();
//	}
//}
public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("양의 정수 10개를 입력하시오>> ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3==0)System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}
