package Chapter03;

public class ForTest {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
//		n 이 100 미만 일때까지 반복(99까지)
//		증감식 n+=2 (실행문이 끝나면 2씩 증가)
		for(; n<100;n += 2) {
			sum += n;
//		반복
		}
		System.out.println(sum);
	}
}
