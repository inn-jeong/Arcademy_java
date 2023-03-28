package Chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");//append(): 문자열을 연결(추가되면서 수정됨)
		System.out.println(sb);
		
		//insert(): 문자열삽입
		sb.insert(7, " my");//This is pencil -> is 다음에 my 삽입
		System.out.println(sb);//This is my pencil
		
		//replace(): 문자열 대체
		sb.replace(8, 10, "your");//This is my pencil -> my가 your
		System.out.println(sb);//This is your pencil
		
		//delete(): 문자열 삭제
		sb.delete(8, 13);
		System.out.println(sb);
		
		//setLength(): 문자열 길이 수정
		sb.setLength(4);//This is pencil ->This
		System.out.println(sb);//This
	}
}
