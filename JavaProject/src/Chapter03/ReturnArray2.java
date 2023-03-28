package Chapter03;

public class ReturnArray2 {
	public static int[] makeArray() {
		int[] arr = new int[10]; // 길이10인 배열 생성
//		각 원소에 index+1 값 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = makeArray();
//		배열 원소에 100식 더해서 출력
		for(int i: arr)System.out.print(i+100+" ");
	}
}
