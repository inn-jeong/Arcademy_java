package Chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		System.out.print("정수 3개 입력>> ");
		/*
		for(int i=0; i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
//		숫자를 오름차순으로 정렬
		Arrays.sort(num);
//		num[1]의 값이 중간값이 된다
		*/
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int median = 0;
		
		if((a>b && a<c) || (a>c && a<b)) median = a;
		else if((b>a && b<c) || (b>c && b<a)) median = b;
		else median = c;
		System.out.println("중간 값은 " +median);
		sc.close();
	}
}
