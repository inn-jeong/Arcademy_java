package Chapter03;
/*
public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
//		n 이 100 미만 일때까지 반복(99까지)
		while(n<100) {
//			sum에 n을 더함
			sum += n;
//			n을 2씩 증가시킴
			n += 2;
//		반복
		}
		System.out.println(sum);
	}
}
*/

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
//		n 이 100 미만 일때까지 반복(99까지)
		while(n<100) {
//			n이 2로 나눈 나머지가 0이라면(짝수라면)
			if(n % 2 == 0) {
//				sum에 n을 더함
				sum += n;
			}
//			n을 1 증가시킴
			n++;
//		반복
		}
		System.out.println(sum);
	}
}