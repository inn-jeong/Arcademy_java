package Chapter04;

public class BabySum {
	public static void main(String[] args) {
//		120개월, 5개국의 데이터를 저장할 배열 생성
		int[][] arr = new int[120][5];
		int sum = 0; //합계
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+1)*100+j+1;
			}
		}
//		확인을 위한 출력문
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				sum += arr[i][j];
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
		
	}
}
