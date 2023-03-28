package Chapter04;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int min=0, max=0;
		System.out.println("양수 10개를 입력하세요.");
		for(int i=0; i<10; i++) {
			num[i] = scan.nextInt();
			if(i == 0) {
//				최소값을 처음 받는 값으로 초기화
				min = num[i];
			}
//			입력 받은 수가 최소값보다 작으면 최신화
			if(num[i] < min) min = num[i];
//			입력 받은 수가 최대값보다 크다면 최신화
			if(num[i] > max) max = num[i];
		}
		System.out.printf("가장 작은 수는 %d이고, 가장 큰 수는 %d이고,"
				+ " 최소값+최대값은 %d입니다.",min,max,min+max);
		scan.close();
	}
}
