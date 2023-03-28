package Chapter03;
/*
 * 훈련생 : 이진영
 * 개발자 환경구축 평가
 * 369게임에서 박수를 쳐야 하는 경우 출력
 * */
public class TreeSixNine {
	public static void main(String[] args) {
		for(int i=1; i<=99; i++) {
			int cnt = 0;
			int ten = i/10; // 10의 자리 숫자
			int one = i%10; // 1의 자리 숫자
//			10의 자리가 3의 배수이면 카운트 +1, 0이 카운트 되는 것을 방지
			if(ten % 3 == 0 && ten != 0) cnt++;
//			1의 자리가 3의 배수이면 카운트 +1, 0이 카운트 되는 것을 방지
			if(one % 3 == 0 && one != 0) cnt++;
//			카운트에 따른 출력
			if(cnt == 1){ // 카운트가 1이라면 숫자+"박수한번" 출력
				System.out.println(i+" 박수한번");
			}
			else if(cnt == 2) { // 카운트가 2라면 숫자+"박수두번" 출력
				System.out.println(i+" 박수두번");
			}
		}
	}
}
