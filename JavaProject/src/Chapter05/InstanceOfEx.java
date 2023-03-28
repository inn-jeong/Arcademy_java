package Chapter05;
/*
 * instanceof 연산자 사용(상속)
 * */
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}
public class InstanceOfEx {
	static void print(Person p) {//Person p = new Student()->업캐스팅
		if(p instanceof Person) {//학생,연구원,교수 객체나 사람이냐
			System.out.print("Person ");//참이면 출력
		}
		if(p instanceof Student) {//학생 객체가 학생이냐
			System.out.print("Student ");//참이면 출력
		}
		if(p instanceof Researcher) {//학생 객체가 연구원이냐
			System.out.print("Researcher ");//참이면 출력
		}
		if(p instanceof Professor) {//학생 객체가 교수냐
			System.out.print("Professer ");//참이면 출력
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student()->\t"); print(new Student());
		System.out.print("new Researcher()->\t"); print(new Researcher());
		System.out.print("new Professer()->\t"); print(new Professor());
		
	}
}
