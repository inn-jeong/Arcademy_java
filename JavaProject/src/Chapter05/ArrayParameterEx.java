package Chapter05;

public class ArrayParameterEx {
//	String[] 배열을 전달받아 출력하는 메소드
	public static void printStringArray(String[] str) {
		for(String i: str) System.out.print(i);
		System.out.println();
	}
//	String[] 배열을 전달받아 "be"를 "eat"으로 바꾸는 메소드
	public static void replaceBe(String[] str) {
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("be")) str[i] = "eat";
		}
	}
	public static void main(String[] args) {
		String[] str = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
		printStringArray(str);
		replaceBe(str);
		printStringArray(str);
	}
}
