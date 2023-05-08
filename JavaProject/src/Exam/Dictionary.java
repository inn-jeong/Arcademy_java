package Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> dict = new HashMap<String, String>();
		String kor,eng;
		//사전 단어 추가
		dict.put("사랑", "love");
		dict.put("아기", "baby");
		dict.put("돈", "money");
		dict.put("미래", "future");
		dict.put("희망", "hope");
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			//한글 입력
			System.out.print("한글 단어?");
			kor = scan.nextLine();
			//"그만" 입력 시 종료
			if(kor.equals("그만")) break;
			//사전에서 입력된 한글 단어 찾음
			eng = dict.get(kor);
			//사전에 입력된 한글 단어가 없을 시
			if(eng == null) System.out.println(kor+"는 저의 사전에 없습니다.");
			//사전에 입력된 한글 단어가 있을 시
			else System.out.println(kor+"은 "+eng);
		}
		scan.close();
	}
}
