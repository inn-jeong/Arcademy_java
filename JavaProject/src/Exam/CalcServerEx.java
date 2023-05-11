package Exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcServerEx {
	public static void main(String[] args) {
		ServerSocket listener = null;//소켓 선언
		Socket socket = null;//클라이언트 소켓 선언
		BufferedReader in = null;//입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;//출력: 서버에서 보내는 데이터
		Scanner scan = new Scanner(System.in);
/////////////////////CalcServerEx.java/////////////////////////////////
		try {
			listener = new ServerSocket(9999);//서버소켓 객체 생성
			System.out.println("연결을 기다리고 있습니다.....");
			//소켓 객체로 데이터를 주고 받음
			socket = listener.accept();//클라이언트의 연결의 대기
			//입력: 클라이언트에서 들어오는 데이터
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();//한행의 문자열을 읽는다.
				if(inputMessage.equals("bye")) {//클라이언트 메시지가 bye일때
					System.out.println("클라이언트에서 연결을 종료하였음");
					break;
				}
				System.out.println(inputMessage);//클라이언트에서 온 메시지
//				String output = calc1(inputMessage);
				String output = calc2(inputMessage);
				out.write(output+"\n");
				out.flush();//비정상적인 종료일 때 메시지 전송
			}
		} catch (Exception e) {
			e.printStackTrace();//예외처리시 시스템에서 자동으로 출력되는 메시지
		} finally {
			try {
				//자원 반납(예외 발생까지 고려)
				scan.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {//서버와 클라이언트 간에 입출력 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
		}
		
	}
	//입력받은 문자열로 계산하여 값을 반환
	public static String calc1(String message) {
		String[] arrStr = message.split(" ");
		if(arrStr.length != 3) return "형식에 맞지 않습니다.";
		
		String num1 = arrStr[0];
		String cal = arrStr[1];
		String num2 = arrStr[2];
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int result = 0;
		
		switch(cal) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1-n2;
			break;
		case "*":
			result = n1*n2;
			break;
		case "/":
			if(n2 == 0) return "0으로 나눌 수 없습니다.";
			result = n1/n2;
			break;
		default:
			return "잘못 입력하였습니다.";
		}
		return result+"";
	}
	public static String calc2(String str){
		StringTokenizer st = new StringTokenizer(str, " ");
		
		if(st.countTokens() != 3){
			return "error";
		}
		int op1 = Integer.parseInt(st.nextToken());
		String op = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		int res = 0 ;
		switch(op){
		case "+":
			res = op1+op2;
			break;
		case "-":
			res = op1 - op2;
			break;
		case "*":
			res = op1*op2;
			break;
		case "/":
			if(op2 == 0) return "0으로 나눌 수 없습니다.";
			res = op1/op2;
			break;
		default:
			return "error";
		}
		return res+"";
	}
}
