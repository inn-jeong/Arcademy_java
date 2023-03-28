package Chapter04;

public class TV {
	String bland = "";
	int year = 0;
	int inch = 0;
	public TV(String bland, int year, int inch) {
		this.bland = bland; //필드 bland에 매개변수 bland 값 저장
		this.year = year;	//필드 year에 매개변수 year 값 저장
		this.inch = inch;	//필드 inch에 매개변수 inch 값 저장
	}
	public void show() {
//		아래 출력문은 this를 붙여도 되고 안 붙여도 된다. this 유무에 상관 없이 같은 출력을 보여줌
		System.out.println(this.bland+"에서 만든 "+this.year+"년형 "+this.inch+"인치 TV");
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32); //TV클래스타입 참조변수 myTV에 새로운 TV클래스 객체 생성
		myTV.show();
	}
//	public TV(String bland, int year, int inch) {
//		super();
//		this.bland = bland;
//		this.year = year;
//		this.inch = inch;
//	}
}
