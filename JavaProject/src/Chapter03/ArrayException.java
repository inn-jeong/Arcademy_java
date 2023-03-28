package Chapter03;

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		
//		0
//		1
//		3
//		6
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//			at Chapter03.ArrayException.main(ArrayException.java:10)
		
//		0
//		1
//		3
//		6
//		배열의 인덱스가 범위를 벗어났습니다.
//		예외가 발생될 수 있기에 예외처리
		try {
			//i값이 0~4
			for (int i = 0; i < intArray.length; i++) {
				//0+1+0 -> intArray[1]=1; i=0
				//1+1+1 -> intArray[2]=3; i=1
				//2+1+3 -> intArray[3]=6; i=2
				//3+1+6 -> intArray[4]=10; i=3
				//4+1+10 -> intArray[5]=15; i=4 // 여기서 오류 발생
				intArray[i+1] = intArray[i]+i+1;
				System.out.println(intArray[i]);
			}
//		} catch (Exception e) {
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
