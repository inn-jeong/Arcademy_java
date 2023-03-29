package Chapter09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String maxWord=""; //가장 긴 이름을 저장할 변수
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>> "); 
			String word = scan.nextLine();
			list.add(word);
			//입력받은 문자열이 가장 긴 이름보다 길다면
			if(word.length()>=maxWord.length()) {
				maxWord = word;//최신화
			}
		}
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("가장 긴 이름은:"+maxWord);
		scan.close();
	}
}
