package Chapter04;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
//		입력 받은 문자열을 그 자리에서 char타입으로 추출해서 char타입 변수에 저장
		char input = scan.next().charAt(0);
//		입력 받은 문자 알파벳부터 'a'까지 1씩 감소하는 i를 가지는 반복문
		for(char i=input; i>='a'; i--) {
//			'a'부터 i까지의 j를 가지는 반복문
			for(char j='a'; j<=i; j++) {
				System.out.print(j);				
			}
//			'a'~i까지 출력되면 줄 바꿈
			System.out.println();
		}
		scan.close();
	}
}
