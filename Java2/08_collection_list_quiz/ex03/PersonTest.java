package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int n = scan.nextInt();
			scan.nextLine(); // 개행문자 제거
			
			if (n == 1) {
				// 입력
				System.out.print("이름을 입력하세요: ");
				Person person = new Person();
				person.setName(scan.nextLine());
				System.out.print("생년월일을 입력하세요: ");
				person.setYyyymmdd(scan.nextInt());
				
				System.out.println(personList.add(person) ? "입력 성공" : "입력 실패");
			} else if (n == 2) {
				// 출력
				if (personList.isEmpty()) {
					System.out.println("비어 있습니다.");
					continue;
				} 
				
				System.out.println(personList.toString());
			} else if (n == 3) {
				// 삭제
				System.out.print("삭제할 사람의 이름을 입력하세요: ");
				String deleteName = scan.nextLine();
				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person person = iter.next();
					if (person.getName().equals(deleteName)) {
						iter.remove();
					}
				}
			} else if (n == 4) {
				// 종료
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
}
