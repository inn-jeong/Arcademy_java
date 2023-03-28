package Chapter03;

public class ForSample {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum += i;
//			i가 1~9 까지는 i"+" 출력 
			if(i <= 9) System.out.print(i+"+");
//			i가 10 이라면 "="i 출력
			else System.out.print(i+"="+sum);
		}
	}
}
