package Chapter05;

import java.util.Random;

public class twoDArray {
	public static void main(String[] args) {
		Random generator = new Random();
		int[][] arr = new int[4][4];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int ranNum = generator.nextInt(10)+1;
				arr[i][j] = ranNum;
				System.out.print(ranNum+" ");
			}
			System.out.println();
		}
		
	}
}
