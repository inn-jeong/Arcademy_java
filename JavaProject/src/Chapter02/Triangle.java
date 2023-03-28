package Chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		System.out.print("삼각형의 세 변의 길이를 입력하시오: ");
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
//		위 또는 아래와 같이 코드 작성
		/*
		System.out.print("삼각형의 세 변의 길이를 입력하시오: ");
		for(int i=0; i<num.length; i++) {			
			num[i] = sc.nextInt();
		}
		*/
		Arrays.sort(num);
		
		if(num[0] < num[1] + num[2]) System.out.println("삼각형이 됩니다.");
		else System.out.println("삼각형이 안 됩니다.");
		sc.close();
	}
}
