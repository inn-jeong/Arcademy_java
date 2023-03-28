package Chapter02;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>> ");
//		달 입력
		int season = sc.nextInt();
		/*
		switch(season) {
//		3~6: 봄
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
//		6~8: 여름
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
//		9~11: 가을
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
//		12,1,2: 겨울
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
//		그 이외: 잘못 입력
		default:
			System.out.println("잘못 입력");	
		}
		*/
//		위의 코드가 지저분하여 보기 쉽게 정리
		switch(season/3) {
		case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("여름");
			break;
		case 3:
			System.out.println("가을");
			break;
		case 0:
		case 4:
			if(season <= 12 && season > 0) {
				System.out.println("겨울");
				break;
			}
		default:
			System.out.println("잘못 입력");
		}
		sc.close();
	}
}
