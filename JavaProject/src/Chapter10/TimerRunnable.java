package Chapter10;

public class TimerRunnable implements Runnable{
	int n=0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			//1초마다 실행
			try {
				Thread.sleep(1000);
				//예외 발생할 때 e로 catch해서
			} catch (InterruptedException e) {
//				printStackTrace메소드로 기본 예외처리 메시지 출력
				e.printStackTrace();
			}
		}
	}
}
