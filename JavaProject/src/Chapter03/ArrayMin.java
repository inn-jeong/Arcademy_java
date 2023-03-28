package Chapter03;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int[] array = new int[7];
		int min = 0;
		//초기화 2
//		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
			//초기화 1
			if(i == 0) min = array[i];
			//방법 1
//			min = Math.min(array[i], min);
			//방법 2
			if(array[i] < min) min = array[i];
		}
		System.out.println("가장 작은 수는 "+min+"입니다.");
		scan.close();
	}
}
