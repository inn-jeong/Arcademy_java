package Exam;
/*
 * 평가시험: 인터페이스 구현
 * 훈련생 : 이진영
 * */
interface ArrayEx{
	int[][] randomArr(int[][] arr);
	int sumArr(int[][] arr);
	void printArr(int[][] arr);
}
public class InterfaceEx implements ArrayEx{
//	배열에 난수를 저장해주는 메소드
	@Override
	public int[][] randomArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10);
			}
		}
		return arr;
	}
//	배열 원소들의 합을 구하는 메소드
	@Override
	public int sumArr(int[][] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
//	매개변수로 받은 배열의 원소들을 출력해주는 메소드
	@Override
	public void printArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		InterfaceEx a = new InterfaceEx();
		a.randomArr(arr);
		a.printArr(arr);
		System.out.println("합은 "+a.sumArr(arr));
	}
	
	
}