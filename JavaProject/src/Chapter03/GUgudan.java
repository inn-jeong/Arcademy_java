package Chapter03;

public class GUgudan {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%d ",i,j,i*j);
//				가지런히 출력하기 위해 탭으로 띄움
				System.out.print("\t");
			}
//			단이 끝나면 한줄 띄움
			System.out.println();
		}
	}
}
