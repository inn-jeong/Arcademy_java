/*
 * 자바 개발자
 * 훈련생: 이진영
 * */
package Exam;

public class Loop {
	public static void main(String[] args) {
		for(int i=9; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
