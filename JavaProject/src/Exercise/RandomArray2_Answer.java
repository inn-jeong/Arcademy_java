package Exercise;

import java.util.Scanner;

public class RandomArray2_Answer {
	public static boolean exists(int[] a, int from, int r ) {
		for(int i=0; i<from; i++) {
			if(a[i]==r) {
				return true;//중복 발생
			}
		}
		return false;//중복 아님
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<array.length; i++) {
			int r = (int)(Math.random()+100)+1;
			//난수를 배열에 넣을 때 중복체크
			if(exists(array,i,r)) {
				i--;
				continue;
			}
			array[i]=r;
		}
		
		//출력을 위한 반복문
		for(int i=0; i<array.length; i++) {
			if(i%10 == 0 && i!=0) {
				System.out.println();
			}
			System.out.print(array[i]+" ");
		}
		scan.close();
	}
}
