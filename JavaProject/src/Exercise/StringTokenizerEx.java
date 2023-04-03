package Exercise;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer tokens = new StringTokenizer(str,"/");
		int index = tokens.countTokens();
		for(int i=0; i<index; i++) {
			System.out.println(tokens.nextToken());
		}
	}
}
