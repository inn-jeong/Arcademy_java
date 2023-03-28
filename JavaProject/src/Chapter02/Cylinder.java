package Chapter02;

public class Cylinder {
	public static void main(String[] args) {
		double r =7;
		double h =5;
		
		double v = volume(r,h);
		System.out.println("반지름이"+r+", 높이가"+h+"인 원기둥의 부피: "+v);
	}
//	매개변수가 2개인 메소드(원기둥 부피 구하기)
	public static double volume(double radius, double height) {
//		Math.PI : Math 클래스의 PI 속성
//		Math 클래스의 PI 필드를 불러와 사용
//		원기둥의 부피를 구하는 공식 사용하여 원기둥 부피값을 반환
		return Math.PI * radius * radius * height;
	}
}
