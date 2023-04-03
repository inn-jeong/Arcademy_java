package Exercise;

public class Student {
	String Name = "";
	int Number = 0;
	String Department = "";
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	@Override
	public String toString() {//이름,학번,소속학과를 반환
		String str = "이름: "+Name+"\n학번: "+Number+"\n소속학과: "+Department;
		return str;
	}
	
}
