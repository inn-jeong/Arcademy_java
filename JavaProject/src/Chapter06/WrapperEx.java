package Chapter06;

public class WrapperEx {
	public static void main(String[] args) {
		char c1='4', c2='F';
		//Character Wrapper 클래스
		//isDigit 숫자체크하는 메소드
		if(Character.isDigit(c1)) {
			System.out.println("숫자");
		}
		else {
			System.out.println("숫자 아님");
		}
		if(Character.isDigit(c2)) {
			System.out.println("숫자");
		}
		else {
			System.out.println("숫자 아님");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println("영문자");
		}
		else {
			System.out.println("영문자 아님");
		}
		if(Character.isAlphabetic(c1)) {
			System.out.println("영문자");
		}
		else {
			System.out.println("영문자 아님");
		}
		//Integer: Wrapper 클래스, parseInt:문자열을 정수로 변환
		System.out.println(Integer.parseInt("-123"));//정수 -123출력
		System.out.println(Integer.parseInt("28"));
		System.out.println(Integer.toHexString(28));//1c=16+12=28(16진수)
		System.out.println(Integer.toBinaryString(28));//11100=16+8+4=28(2진수)
		System.out.println(Integer.bitCount(28));//11100->1이 3개(2진수)
		
		Double d = Double.valueOf(3.14);//3.14를 포함하는 객체를 가리키는 d 참조변수
		System.out.println(d.toString());//문자열 3.14 출력
		//parseDouble: 문자열을 실수로 변환하는 메소드
		System.out.println(Double.parseDouble("3.14"));//실수 3.14를 출력
		
		boolean b=(4>3);
		//Boolean.toString: Boolean Wrapper 클래스의 toString 메소드로 boolean값을 문자열로 변환
		System.out.println(Boolean.toString(b));
		//parseBoolean: parseBoolean 메소드로 문자열을 불린값으로 반환
		System.out.println(Boolean.parseBoolean("false"));//boolean값 false 출력
		
		
		
		//test
		System.out.println(Integer.valueOf(5).hashCode());
		System.out.println(d);
		Integer x = Integer.valueOf(10);
		Integer y = Integer.valueOf(10);
		//새로운 객체라도 Wrapper 클래스는 값을 따짐
		if(x == y) System.out.println("x == y");
	}
}
