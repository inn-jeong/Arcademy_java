package Chapter03;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		int cospi = scan.nextInt();
		System.out.print("환율을 입력하세요(1100~1200): ");
		int rate = scan.nextInt();
//		환율이 1150 이상
		if(rate >= 1150) {
//			코스피가 2200이상
			if(cospi >= 2200) System.out.println("상승장");
//			코스피가 2200 미만
			else if(cospi >= 2000) System.out.println("횡보장");
//			코스피가 2000 미만
			else System.out.println("하락장");
		}
//		환율이 1150 미만
		else {
//			코스피가 2300 이상
			if(cospi >= 2300) System.out.println("상승장");
//			코스피가 2300미만 2000이상
			else if(cospi >= 2000) System.out.println("횡보장");
//			코스피가 2000 미만
			else System.out.println("하락장");
		}
		scan.close();
	}
}
