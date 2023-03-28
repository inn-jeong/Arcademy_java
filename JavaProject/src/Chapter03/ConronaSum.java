package Chapter03;

public class ConronaSum {
	public static void main(String[] args) {
		int[][] arr = new int[12][3];
		int sum =0;
//		문제에서 말하는 조건대로 1월은 11,12,13 12월은 121,122,123 을 입력하는 알고리즘이다.
//		행 기준(1월~12월), corona.length = 12
		for(int i=0; i<arr.length; i++) {
//			열 기준(0~2). corona[i].length = 3
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+1)*10 + j+1;
			}
		}
//		2차원 배열의 값들을 모두 더함
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//확인을 위한 출력문
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
