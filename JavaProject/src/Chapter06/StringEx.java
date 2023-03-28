package Chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		//length() : 문자열의 길이
		System.out.println(a+"의 길이는 "+a.length());// C#의 길이는 3(스페이스 포함)
		//contains(): 문자열을 포함 여부
		System.out.println(a.contains("#"));//true
		System.out.println(a.contains("*"));//false
		
		a = a.concat(b);//concat(): 문자열 연결
		System.out.println(a);// C#,C++ (새로운 문자열을 a가 가리킴)
		
		a = a.trim();//trim(): 앞, 뒤 공백 제거
		System.out.println(a);//C#,C++
		
		a = a.replace("C#", "Java");//replace(): 문자열 대체
		System.out.println(a);//Java,C++
		
		String[] s = a.split(",");//split(): 문자열을 분리
		for(int i=0; i<s.length; i++) {
			/*
			 * 분리된 문자열0: Java
			 * 분리된 문자열1: C++
			 */
			System.out.println("분리된 문자열"+i+":"+s[i]);
		}
		//or
//		for(String i: s)System.out.print("\""+i+"\" ");
//		System.out.println();
		a = a.substring(5);//substring(): 인덱스값으로 시작하는 문자열
		System.out.println(a);//Java,C++ => C++
		
		char c = a.charAt(2);//charAt(): 인덱스에 해당하는 문제
		System.out.println(c);//C++ => +
		
		////////////test/////////////////
		String str = "abc";
		String str2 = "def";
		System.out.println("str:"+str.hashCode());
		System.out.println("str2:"+str2.hashCode());
		str = str+str2;
		System.out.println(str);
		System.out.println("str+str2:"+str.hashCode());
		String str3 = "abc";
		String str4 = "def";
		System.out.println("str3:"+str3.hashCode());
		System.out.println("str4:"+str4.hashCode());
		str3 = str3.concat(str4);
		System.out.println(str3);
		System.out.println("str+str2:"+str3.hashCode());
		
		
	}
}
