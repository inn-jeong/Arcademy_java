package Chapter02;
/*
 * 커피 주문을 받아서 커피명과 가격을 출력
 * */

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 커피를 드릴까요? ");
//		next(): 문자열 입력받는 메소드
		String order = sc.next();
//		커피 가격 변수 선언
		int price=0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴가 없습니다.");
		}
//		price가 0이 아닐 경우 출력을 방지하기 위해 if문 추가
		if(price != 0) System.out.println(order+"는 "+price+"원입니다.");
		sc.close();
	}
}
