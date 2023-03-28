package Chapter03;

public class Print2DArray {
	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		for(int i=0; i<n.length; i++) { //i행
			for(int j=0; j<n[i].length; j++) { //i행 j열
				System.out.print(n[i][j]);
			}
//			i행 출력이 끝나면 줄 바꿈
			System.out.println();
		}
	}
}
