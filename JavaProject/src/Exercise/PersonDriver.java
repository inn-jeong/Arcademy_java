package Exercise;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fname;
		String lname;
		
		System.out.print("성을 입력하세요: ");
		lname = scan.next();
		System.out.print("이름을 입력하세요: ");
		fname = scan.next();
		
		Person person1 = new Person();
		person1.lastName = lname;
		person1.firstName = fname;
		System.out.println("성:"+person1.getLastName()+" 이름:"+person1.firstName+"성명의 길이:"+person1.getLength());
		
		System.out.print("성을 입력하세요: ");
		lname = scan.next();
		System.out.print("이름을 입력하세요: ");
		fname = scan.next();
		
		Person person2 = new Person();
		person2.lastName = lname;
		person2.firstName = fname;
		System.out.println("성:"+person2.getLastName()+" 이름:"+person2.firstName+"성명의 길이:"+person2.getLength());
		
		scan.close();
	}
}
