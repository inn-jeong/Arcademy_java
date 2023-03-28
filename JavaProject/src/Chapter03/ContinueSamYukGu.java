package Chapter03;

public class ContinueSamYukGu {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
//			숫자가 3의 배수이면
			if(i % 3 ==0) {
				System.out.print("짝 ");
//				반복문 시작지점으로 돌아감
				continue;
			}
			System.out.print("\b"+i+" ");
		}
	}
}
