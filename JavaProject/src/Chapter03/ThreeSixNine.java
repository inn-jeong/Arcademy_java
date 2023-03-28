package Chapter03;

import java.util.Scanner;

public class ThreeSixNine {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("10~99 사이의 정수를 입력하시오>> ");
//		int num = scan.nextInt();
//		int threeSixNine = num;
//		while(num != 0) {
////			숫자가 3,6,9 중 하나가 있다면
//			if(num %10 == 3 || num %10 == 6 || num %10 == 9) {
////				처음 출력은 "박수" 출력
//				if(threeSixNine == num) {
//					System.out.print("박수");
//				}
////				"짝" 출력
//				System.out.print("짝");
//			}
//			num /= 10;
//		}
//		scan.close();
//	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오>> ");
		int num = scan.nextInt();
		int count = 0;
		int a = num/10;
		int b = num%10;
		if(a % 3 == 0) {
			count++;
		}
		if(b % 3 == 0 && b != 0) {
			count++;
		}
		if(count == 2) {
			System.out.println("박수짝짝");
		} else if(count == 1) {
			System.out.println("박수짝");
		} else {
			System.out.println("박수없음");
		}
		scan.close();
	}
}
