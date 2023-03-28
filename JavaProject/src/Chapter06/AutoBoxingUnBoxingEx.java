package Chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		//n값을 가지는 객체 생성(intObject: 참조변수)
		Integer intObject = Integer.valueOf(n);
		//auto Boxing
		Integer intObject2 = Integer.valueOf(n);
		System.out.println("intObject = "+intObject);//10출력
		System.out.println("intObject2 = "+intObject2);//10출력
		
//		int m = intObject.intValue()+intObject2.intValue();//unboxing
//		int m = intObject+intObject2.intValue();//auto unboxing
		int m = intObject+intObject2;// real autounboxing
		System.out.println("m = "+m);
	}
}
