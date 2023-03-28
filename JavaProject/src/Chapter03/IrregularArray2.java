package Chapter03;

public class IrregularArray2 {
	public static void main(String[] args) {
		int[][] arr = new int[5][]; //5행을 가지는 2차원 배열 생성
		arr[0] = new int[5];		//1행은 5열
		arr[1] = new int[1];		//2행은 1열
		arr[2] = new int[4];		//3행은 4열
		arr[3] = new int[2];		//4행은 2열
		arr[4] = new int[3];		//5행은 3열 배열 생성
		
//		행은 5이므로 i의 범위는 0~4
		for(int i=0; i<arr.length; i++) {
//			열은 불규칙하다. 범위는 차례로 0부터~ 4,0,3,1,2
			for(int j=0; j<arr[i].length; j++) {
//				입력되는 값을 만드는 로직
				//(0,0) ->(0+3)*10+5+0=35
				//(0,1) ->(0+3)*10+5+1=36
				//.
				//.
				//(1,0) ->(1+3)*10+5+0=45...
				//(0,0)~(4,2) 반복, 행(30~70번대까지 반복)
				arr[i][j] = (i+3)*10 + j+5;
			}
		}
//		출력을 위한 반복문
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
