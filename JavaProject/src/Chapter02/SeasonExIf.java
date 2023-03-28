package Chapter02;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>> ");
//		달 입력
		int season = sc.nextInt();
//		3~6: 봄
		if(season >= 3 && season <= 5) System.out.println("봄");
//		6~8: 여름
		else if(season >= 6 && season <= 8) System.out.println("여름");
//		9~11: 가을
		else if(season >= 9 && season <= 11) System.out.println("가을");
//		12~2: 겨울
		else if(season == 12 || season == 1 ||season == 2) System.out.println("겨울");
//		그 외 숫자: 잘못 입력
		else System.out.println("잘못 입력");
		sc.close();
	}
}
