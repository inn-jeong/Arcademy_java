package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class StreamTest {
	public static void main(String[] args) {
//		upcasting으로 ArrayList 객체 생성
//		제네릭 타입파라미터로 클래스로 선언해서 객체를 데이터로 받음
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "NoteBook", 100));
		list.add(new Product(2, "TV", 320));
		list.add(new Product(3, "Washing Machine", 250));
		list.add(new Product(4, "Air Conditioner", 500));
		
		List<String> result = list.stream()		//스트림 생성
								.filter(p->p.price > 300) //가격이 300 초과한 제품을 추출
								.map(p->p.name)//추출한 제품 이름
								.collect(Collectors.toList());//List로 변환
		
		System.out.println(result);
	}
}
