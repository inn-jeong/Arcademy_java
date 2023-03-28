package Chapter03;
/*
 * 구구단을 배열로 생성
 * 값을 넣어본다 ex> 2*7=14, 9*4=36
 * */
public class Ex3_9 {
	public static void main(String[] args) {
//		2차원 배열 선언(1차원은 열로 구성, 1차원이 2개 이상 가지고 행으로 구성)
//		1*1=1~9*9=81
//		int[][] gugudan; //2차원 배열
//		2차원 배열 선언, 생성(9행 9열)
//		int[][] gugudan = new int[9][9];
		int[][] gugudan = new int[10][10];
		
//		gugudan.length = 9행
//		1~9까지(<10)
//		for (int i = 0; i < gugudan.length; i++) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				행렬에 1*1 ~ 9*9 까지의 값을 2차원 배열원소로 저장
//				0~8까지를 1~9까지로 저장
//				gugudan[i-1][j-1] = i*j; //i: 행, j: 열(gugudan[i][j])
//				1~9까지를 1~9까지로 저장
				gugudan[i][j] = i*j;
			}
		}
//		반복이 끝나면 1*1~9*9 까지 값들이 저장됨
//		System.out.println("2 X 7 = "+gugudan[2][7]);//전자의 경우 3*8이 출력
//		System.out.println("2 X 7 = "+gugudan[0][6]);//전자의 경우 2*7이 출력하고 싶으면
		System.out.println("2 X 7 = "+gugudan[2][7]);
		System.out.println("9 X 4 = "+gugudan[9][4]);
	}
}
