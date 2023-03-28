package Chapter04;

public class Book2 {
//	("어린왕자", "생텍쥐베리") 저장
//	6. 멤버 저장
	String title;
	String author;
//	4. 생성자 호출됨
//	d. 생성자 호출됨
	public Book2(String title, String author) {
//		매개변수를 this 자기자신의 객체 멤버로 저장
//		5. 멤버 저장
//		c. 멤버 저장
		this.title = title;//"춘향전"
		this.author = author;//"작자미상"
	}
//	2. 생성자 호출됨
	public Book2(String title) {
//		3. this로 생성자 호출
		this(title, "작자미상");
	}
//	b. 생성자 호출됨
	public Book2() {
//		c. this로 생성자 호출
		this("","");
		System.out.println("생성자 호출됨");
//		this("",""); //this 생성자가 첫번째 라인이 아니면 오류
	}
	void show() {
		System.out.println(title+" "+author);
	}
	public static void main(String[] args) {
		Book2 littlePrince = new Book2("어린왕자", "생텍쥐베리");
//		1. 객체 생성하면서 생성자 호출
		Book2 loveStory = new Book2("춘향전");
//		a. 객체 생성하면서 생성자 호출
		Book2 emptyBook = new Book2();
//		System.out.println(littlePrince.title+" "+littlePrince.author);
//		System.out.println(loveStory.title+" "+loveStory.author);
//		System.out.println(emptyBook.title+" "+emptyBook.author);
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}
}
