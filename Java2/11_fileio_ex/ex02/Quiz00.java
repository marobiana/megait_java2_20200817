package quiz00;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz00 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/quiz00/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
			InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
			BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
				
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				String str = br.readLine(); // "apple appel"
				String[] strArr = str.split(" ");
				//System.out.println(strArr[0] + ", " + strArr[1]);
				if (strArr[0].equals(strArr[1])) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
