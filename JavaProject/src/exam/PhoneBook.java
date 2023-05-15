package exam;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> pb = new HashMap<String, String>();
		String name="",phone="",sc_name="", sc_phone;
		
		System.out.print("인원수>> ");
		int loop = scan.nextInt();
		
		for(int i=0; i<loop; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>> ");
			name = scan.next();
			phone = scan.next();
			pb.put(name, phone);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>> ");
			sc_name = scan.next();
			
			if(sc_name.equals("그만")) break;//"그만" 입력시 반복문 탈출
			sc_phone = pb.get(sc_name);
			if(sc_phone != null) {//조회되는 번호가 있다면
				System.out.printf("%s의 번호는 %s 입니다.\n", sc_name, sc_phone);
			}else {//조회되는 번호가 없다면
				System.out.println(sc_name+" 이 없습니다.");
			}
		}
		scan.close(); //자원 반납
	}
}
