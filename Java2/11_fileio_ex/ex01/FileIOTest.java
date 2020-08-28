package ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FileIOTest {

	public static void main(String[] args) throws Exception {
		// 1. 파일 쓰기
		//  FileOutputStream의 두번째 파라미터 의미
		// 		true: 기존에 있던 문장에 append한다.
		//      false: 새로 만든다.
		FileOutputStream output = new FileOutputStream("output.txt", false);
		String text = "!!!반갑습니다!!!";
		output.write(text.getBytes());
		output.close();
		
		// 2. 파일 읽기
		// 운영체제에 있는 파일을 가져온다.(byte로 가져온다)
		FileInputStream inputStream = new FileInputStream("output.txt");
		// byte로 가져와진 내용을 문자로 변환한다. 두번째 파라미터는 인코딩 종류이다.
		InputStreamReader streamReader = new InputStreamReader(inputStream, "ms949");
		// 한 줄씩 읽어들인다.
		BufferedReader br = new BufferedReader(streamReader);
		
		while (true) {
			String readLine = br.readLine();
			if (readLine == null) {
				break;
			}
			
			System.out.println(readLine);
		}
	}
}
