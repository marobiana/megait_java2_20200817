package quiz02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz02 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/FileIO_quiz_ex02/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
			InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
			BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
			
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				readLine = br.readLine();
				
				printReverseString(readLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printReverseString(String str) {
		char[] arr1 = str.toCharArray();
		
		// 1. 일반적인 방법
//		char[] arr2 = new char[arr1.length];
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[arr1.length - 1 - i] = arr1[i];
//		}
//		System.out.println(arr2);
		
		// 2. 큰 회사에서 합격하는 방법
		for (int i = 0; i < arr1.length / 2; i++) {
			char temp = arr1[i];
			arr1[i] = arr1[arr1.length - 1 - i];
			arr1[arr1.length - 1 - i] = temp;
		}
		
		System.out.println(arr1);
	}

}
