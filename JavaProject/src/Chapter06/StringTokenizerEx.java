package Chapter06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "홍길동/장화/홍련/콩쥐/팥쥐";//문자열 생성
		//StringTokenizer 생성자를 이용하여 '/'를 구분문자로 하여 문자열 분리하여 토큰으로 저장
		StringTokenizer tokens = new StringTokenizer(str,"/");
		int index = tokens.countTokens();//토큰의 개수
		//방법1
		for(int i=0; i<index; i++) {
			System.out.println(tokens.nextToken());
		}
		//방법2(while과 동일)
		for(; tokens.countTokens()>0;) {
			System.out.println(tokens.nextToken());
		}
		//방법3(강사님 코드)
		while(tokens.hasMoreTokens()) {//hasMoreTokens(): 토큰이 있으면 참
			System.out.println(tokens.nextToken());//nextToken():토큰을 꺼내온다.
		}
	}
}
