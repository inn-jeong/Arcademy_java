package Chapter12;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] a = {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,5445,4,63,2,1};
		System.out.println(Arrays.asList(a));//List로 한번에 출력 가능
		
		Arrays.sort(b,4,14);//인덱스정렬(4~14)
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);//인덱스정렬(4~14)
		System.out.println(Arrays.toString(b));//String으로
		
		Arrays.sort(a,Collections.reverseOrder());//문자열 배열을 거꾸로
		System.out.println(Arrays.toString(a));//String으로
		
		Arrays.sort(a);//오름차순 정렬
		System.out.println(Arrays.toString(a));//string으로
		Arrays.sort(a,2,4,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));//string으로
		
//		앞의 숫자들을 비교하며 내림차순
		String[] cc = {"11","12","13","23","53","223","154","54"};
		Arrays.sort(cc,Collections.reverseOrder());
		System.out.println(Arrays.toString(cc));
		
		int[] c = Arrays.copyOf(b, b.length);//배열객체를 복사
		System.out.println(Arrays.toString(c));
		
		String[] d = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(d));
	}
}
