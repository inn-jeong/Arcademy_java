package Chapter04;

public class ArrayParameterEx {
//	전달받은 배열 원소 중 공백을 쉼표로 바꾸는 메소드
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == ' ') {
				a[i]=',';
			}
		}
	}
//	매개변수로 받은 char 타입 배열의 원소들을 출력하는 메소드
//	2. 호출됨
	static void printCharArray(char a[]) {
//		매개변수 크기만큼 반복
//		3. 배열 원소 출력
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
//		1. 메소드 호출
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
