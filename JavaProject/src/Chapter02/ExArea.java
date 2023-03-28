package Chapter02;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		double[] num = new double[3];
//		세 변의 길이 받음
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
//		마지막으로 받은 값이 0이면 삼각형, 아니면 사다리꼴로 계산
		if(num[2] == 0) {
//			삼각형의 공식 (밑변 * 높이 / 2)
			double triangle = num[0] * num[1] / 2;
			System.out.println("삼각형의 넓이는 "+(num[0]*num[1]/2));
		}
		else {
//			사다리꼴의 넓이 (밑변 + 윗변)* 높이 /2
			double trapezium = (num[0] + num[1]) * num[2] / 2;
			System.out.println("사다리꼴의 넓이는 "+((num[0]+num[1])*num[2]/2));
		}
		sc.close();
	}
}
