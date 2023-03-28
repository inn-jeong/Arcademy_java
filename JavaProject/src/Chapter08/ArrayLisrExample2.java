package Chapter08;

import java.util.ArrayList;

public class ArrayLisrExample2 {
	public static void main(String[] args) {
		//ArrayList 클래스타입으로 ArrayList 클래스로 객체 생성(제너릭 타입파라미터를 String)
		ArrayList<String> array = new ArrayList<String>();
		boolean aaa = array.add("oracle");
		System.out.println(aaa);
		boolean bbb = array.add("mysql");
		System.out.println(bbb);
		boolean ccc = array.add("oracle");//중복된 객체를 추가해도 문제 없음
		System.out.println(ccc);
		for(int i=0; i<array.size(); i++) {
			String str = array.get(i);
			System.out.println(i+":"+str);
		}
		///test/////
		//중복된 객체가 있을 때, remove를 쓰면 어떤 동작을 보여줄까?
		array.remove("oracle");
		for(int i=0; i<array.size(); i++) {
			String str = array.get(i);
			System.out.println(i+":"+str);
		}
		//결론: 앞에 오는 객체가 먼저 지워짐
		
	}
}
