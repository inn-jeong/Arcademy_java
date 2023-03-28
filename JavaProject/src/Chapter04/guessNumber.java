package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int numberToGuess = 0;
		int guess = 0;
		Random generate = new Random();
		numberToGuess = generate.nextInt(10)+1;//1~10 난수 발생
		Scanner scan = new Scanner(System.in);
//		while(true){
//			System.out.print("추측한 숫자를 입력하세요: ");
//			guess = scan.nextInt();
//			if(guess < numberToGuess) { //입력한 숫자가 난수보다 작다면
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 작습니다.");
//			}
//			else if(guess > numberToGuess) {//입력한 숫자가 난수보다 크다면
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 큽니다.");
//			}
//			else {//입력한 숫자와 난수가 같다면
//				System.out.println("맞추셨습니다.");
//				break; //반복문 탈출
//			}
//		}
		while(guess != numberToGuess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
		}
		scan.close();
	}
}
