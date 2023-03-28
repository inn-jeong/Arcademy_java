package Chapter03;

public class DowhileTest {
	public static void main(String[] args) {
		int i=0;
		int sum =0;
		do {
//			i가 짝수라면 sum에 더함
			if(i % 2 == 0) {
				sum += i;
			}				
			i++;
//			i 가 99 이하면 다시 반복
		} while (i<=99);
		System.out.println(sum);
	}
}
