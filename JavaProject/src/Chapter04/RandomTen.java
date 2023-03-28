package Chapter04;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		Random rNum = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = rNum.nextInt(10)+1;
			sum += arr[i];
		}
		System.out.print("랜덤한 정수들: ");
		for(int i: arr) System.out.print(i+" ");
//		방법 1
		System.out.println();
		System.out.print("평균은 "+(double)sum/arr.length);
//		방법 2
		System.out.println("\n평균은 "+(double)sum/arr.length);
	}
}
