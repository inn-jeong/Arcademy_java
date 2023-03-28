package Chapter03;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
//	throws: 메소드 호출한 곳으로 예외처리를 넘김
	public static void findClass() throws ClassNotFoundException {
//		forName 메소드: 클래스명을 찾는다.
//		Class.forName("java.lang.String");
		Class.forName("java.lang.String2");
//		Class.forName("A");
		/*
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
	}
}
