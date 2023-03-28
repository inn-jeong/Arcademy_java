import java.util.Scanner;

public class Cone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
//		double 타입의 반지름 변수 생성 후 정수 입력값을 저장
		int radius = scan.nextInt();
//		double 타입의 높이 변수 생성 후 정수 입력값을 저장
		System.out.print("원뿔의 높이를 입력하세요: ");
		int height = scan.nextInt();		
//		원뿔의 부피 공식 : 1/3 * PI * 반지름 제곱 * 높이
//		double volume =  1.0/3.0 * Math.PI * radius * radius * height;
		double volume =  (double)1/3 * radius * radius * height * Math.PI ;
		System.out.println("원뿔 밑의 원의 반지름: " + radius);
		System.out.println("원뿔의 높이: " + height);
		System.out.println("원뿔의 부피: " + volume);
		
		scan.close();
	}
}
