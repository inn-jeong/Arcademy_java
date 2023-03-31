package Exercise;

public class Person {
	String lastName;
	String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getLength() {
		return lastName.length()+firstName.length();
	}
}
