package Chapter02;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = {100, 100}; // 범위1(x1,y1)
		int[] b = {200, 200}; // 범위2(x2,y2)
		int[] c = new int[2]; // 입력값(x, y)
		System.out.print("점(x,y)의 좌표를 입력하시오>> ");
//		정수 2개 입력
		for(int i=0; i<c.length; i++) {
			c[i] = sc.nextInt();
		}
//		x, y 좌표가 100~200 안에 있다면 사각형 안, 아니면 밖
		if((c[0]<=b[0] && c[0]>=a[0]) && (c[1]<=b[1] && c[1]>=a[1])) {
			System.out.println("("+c[0]+","+c[1]+")는 사각형 안에 있습니다.");
//			System.out.printf("(%d, %d)는 사각형 안에 있습니다.",c[0],c[1]);
		} else {
			System.out.println("("+c[0]+","+c[1]+")는 사각형 안에 없습니다.");
//			System.out.printf("(%d, %d)는 사각형 안에 없습니다.",c[0],c[1]);
		}
		sc.close();
	}
}
