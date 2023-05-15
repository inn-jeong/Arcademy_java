package exam;

import java.util.Scanner;

class Game {
	//숫자를 문자열로 변환
	//ex> 0->"가위"
	public String intToString(int num) {
		String result="";
		String[] str = {"가위","바위","보"}; 
		result = str[num];
		return result;
	}
	//문자열을 숫자로 변환
	//ex>"가위"->0
	public int stringToInt(String str) {
		int result=0;
		switch (str) {
		case "가위":
			result = 0;
			break;
		case "바위":
			result = 1;
			break;
		case "보":
			result = 2;
			break;
		case "그만":
			result = 3;
			break;
		default:
			result = -3;
			break;
		}
		return result;
	}
	//승부 결과 반환
	public String result(int user, int com) {
		int vsResult = user - com;
		String result;
		if(vsResult==1 || vsResult==-2) {
			result = "사용자가 이겼습니다.";
		}else if(vsResult==-1 || vsResult==2) {
			result = "컴퓨터가 이겼습니다.";
		}else{//결과가 0일 때
			result = "비겼습니다.";				
		}
		return result;
	}
}
public class RSP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str_vs = new String[2];//0:유저, 1:컴퓨터
		int[] vs = new int[2];//0:유저, 1:컴퓨터
		String result = "";//승부 결과
		
		//게임 시작
		Game game = new Game();
		
		while(true) {
			result = ""; //결과 초기화
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			
			//컴퓨터가 낼 것
			vs[1] = (int)(Math.random()*3);
			str_vs[1] = game.intToString(vs[1]);
			
			//사람이 낼 것
			System.out.print("가위 바위 보!>> ");
			str_vs[0] = scan.nextLine();
			vs[0] = game.stringToInt(str_vs[0]);
			
			//잘못 입력하거나 종료 시
			if(vs[0] == 3) {
				break; //반복문 탈출
			} else if(vs[0] == -3) {//잘못 입력 시
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue; //처음부터 다시
			}
			
			//승부 결과를 숫자로 판단
			result = game.result(vs[0], vs[1]);
			
			System.out.println("사용자 = "+str_vs[0]+", 컴퓨터 = "+str_vs[1]
					+", "+result);
		}
		System.out.println("게임을 종료합니다...");
		scan.close();
	}
}
