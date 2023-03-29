package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("d:\\output.txt");//upcasting
		String data = "안녕 자바 프로그램";
		
		//자바: "안녕 자바 프로그램"에서 인덱스 3번에서 2자를 읽어서 파일로 저장
		writer.write(data,3,2);
		writer.close();
	}
}
