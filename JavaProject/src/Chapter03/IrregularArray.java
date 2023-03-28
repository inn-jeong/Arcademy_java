package Chapter03;

public class IrregularArray {
	public static void main(String[] args) {
//		우선, 행이  4개이고 열은 0인 배열 생성
		int[][] num = new int[7][];
		
		for(int i=0; i<num.length; i++) {
//			행이 짝수라면 열 3개 생성
			if(i % 2 == 0) num[i] = new int[3];
//			행이 홀수라면 열 2개 생성
			else num[i] = new int[2];
//			a행b열의 인덱스 값을 가지고 (a+1)*10 + b 로 십의자리 행+1, 일의자리 열 
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = (i+1)*10 + j;
			}
		}
//		출력을 위한 반복문
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
	enum Type{
		Running, Walking
	}
}
