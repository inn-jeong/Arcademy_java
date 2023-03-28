package Chapter05;
class Person1{
	String name;
	String id;
	public Person1() {
	}
}
class Researcher1 extends Person1{
	String grade;
	String department;
	public Researcher1() {
	}
}
class Professer1 extends Researcher1{
	
}
public class PersonEx {
	public static void main(String[] args) {
		Person1 kim = new Professer1();
		if(kim instanceof Person1) System.out.println("Person");
		if(kim instanceof Researcher1) System.out.println("Researcher");
	}
}
