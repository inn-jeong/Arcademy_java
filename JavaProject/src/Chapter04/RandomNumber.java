package Chapter04;

import java.util.Random;

/*
 * 난수를 발생 Math(클래스), Random(클래스)
 * */
public class RandomNumber {
	public static void main(String[] args) {
		int rNumber = 0;
		Random generator = new Random();
//		for문을 이용
		for(;rNumber != 7;) {
			rNumber = generator.nextInt(10)+1;
			System.out.println(rNumber);
		}
//		while문을 이용
		while(rNumber != 7) {
			rNumber = generator.nextInt(10)+1;
			System.out.println(rNumber);
		}
		
		/*
		rNumber = generator.nextInt();//난수 발생(범위: int타입 범위->-2의 31승~2의31승-1)
		rNumber = generator.nextInt(10); //난수 발생(0~9까지의 정수)
		rNumber = generator.nextInt(10)+1; //난수 발생(1~10까지의 정수)
		rNumber = generator.nextInt(10)*(-1); //난수 발생(-9~0까지의 정수)
		*/
//		generator.nextDouble();double범위, .nextLong();long타입범위, .nextBoolean();참/거짓
	}
}
