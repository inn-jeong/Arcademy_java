package Exercise;
import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		Label:
		for(int i=0; i<num; i++) {
			arr[i] = (int)(Math.random()*20)+1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {//같은 숫자가 있다면
					i--; //i-1
					//방법 1
					break;
					//방법 2
//					continue Label;
				}
			}
		}
		//출력을 위한 반복문
		for(int i=0; i<arr.length; i++) {
			if(i%10 == 0 && i!=0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}
