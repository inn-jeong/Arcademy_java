package Chapter03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		String str = scan.next();
		int i=0;
		while(scan.hasNext()) {
			i++;
//			System.out.print(">>");
//			String str = scan.next();
//			문자열은 == 비교연산자를 사용하면 같은 문자열이라도 객체가 다르면 false가 나올 수 있기 때문에
//			.equals() 메소드를 사용해 준다.
			System.out.println("##%%"+ i);
//			str = scan.next();
//			if(str.equals("e")) {
//				System.out.println("종료합니다...");
//				break;
//			}
		}
		scan.close();
	}
}
