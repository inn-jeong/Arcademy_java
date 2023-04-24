package Exam;

import java.util.Calendar;

public class SayHello {
	public static void main(String[] args) {
		//Calendar 클래스 타입의 참조변수 time
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY);//현재 시각
		int minute = time.get(Calendar.MINUTE);//현재 분
		String str; //인사문구를 저장할 변수
		if(hour >=4 && hour <12) 		str = "Good Morning";
		else if(hour >=12 && hour < 18) str = "Good Afternoon";
		else if(hour >= 18 && hour < 22)str = "Good Evening";
		else 							str = "Good Night";//오후10시~오전4시
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분 입니다.");
		System.out.println(str);
	}
}
