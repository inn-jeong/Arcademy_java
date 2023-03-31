package Exercise;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		for(int i=0; i<arr.length; i++) {
			if(i%10 == 0 && i!=0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}
