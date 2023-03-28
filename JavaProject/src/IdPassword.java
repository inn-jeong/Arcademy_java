import java.util.Scanner;
/*
 * 프로그래밍 언어 응용
 * 문제해결 시나리오 평가
 * 이진영
 * */
public class IdPassword {
	public static void main(String[] args) {
		String password = "myongji60"; 	//비밀번호
		String input = "";				
		int trynumber = 0;				//시도한 횟수
		
		Scanner scan = new Scanner(System.in);
//		비밀번호 입력 횟수가 3번을 넘어가면 반복문 종료
		while(trynumber < 3) {
			System.out.print("암호를 입력하세요: ");
//			입력받은 문자열을 변수 input에 저장
			input = scan.next();
//			trynumber = trynumber + 1
			trynumber++;
//			입력받은 문자열이 비밀번호와 다르다면
			if(!input.equals(password)) System.out.println("암호가 틀립니다.");
//			입력받은 문자열이 비밀번호와 같다면 반복문 종료
			else {
				System.out.println("환영합니다.");
				break;
			}
		}
//		접속 시도한 횟수가 3회를 넘으면 
		if(trynumber >= 3)System.out.println("접속을 거부합니다.");
		scan.close();
	}
}

