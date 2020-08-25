package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		List<String> fruit = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int n = scan.nextInt();
			scan.nextLine(); // 개행문자 소비시킨다.
			
			if (n == 1) {
				// 입력
				System.out.print("과일 이름을 입력하세요: ");
				boolean isSuccess = fruit.add(scan.nextLine());
//				if (isSuccess) {
//					System.out.println("입력 성공");
//				} else {
//					System.out.println("입력 실패");
//				}
				
				System.out.println(isSuccess ? "입력 성공" : "입력 실패");
			} else if (n == 2) {
				// 출력
//				if (fruit.isEmpty()) {
//					System.out.println("비어있습니다.");
//				} else {
//					System.out.println(fruit);
//				}
				
				System.out.println(fruit.isEmpty() ? "비어있습니다." : fruit);
			} else if (n == 3) {
				// 삭제
				System.out.print("삭제할 과일을 입력하세요: ");
				String deleteFruit = scan.nextLine();
				System.out.println(fruit.remove(deleteFruit) ? "삭제 성공" : "삭제 실패");
			} else if (n == 4) {
				// 종료
				break;
			} else {
				System.out.println("잘못 입력되었습니다.");
			}
		}
	}
}
