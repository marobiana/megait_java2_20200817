package ex02;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// 예외처리(Exception) : 예상치 못한 상황을 대처하는 것
		
		// 자주 발생하는 예외
		// 1. NullPointerException => NPE
		// 2. ArrayIndexOutOfBoundsException 
		// 3. ClassCastException
		
		try {
			// 1. NPE
//			String a = null;
//			if (a.isEmpty()) { // npe 발생 지점
//				System.out.println("비어있다.");
//			} else {
//				System.out.println("비어있지 않다.");
//			}
			
			// 배열 참조 예외
//			int[] arr = new int[3];
//			for (int i = 0; i <= arr.length; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}
			
			// 캐스팅 예외
			Object n = 10;
			System.out.println(n);
			
		} catch (NullPointerException npe) {
			System.out.println("NPE가 발생했다.");
			npe.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났다.");
		} catch (ClassCastException e) {
			System.out.println("캐스팅 예외가 발생했다.");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("수행 완료");
		
		a();
	}

	public static void a() throws Exception { // throws: 예외를 상위 메소드에 던짐
		b();
	}
	
	public static void b() throws Exception { // throws: 예외를 상위 메소드에 던짐
		throw new Exception(); // throw: 임의로 예외 발생
	}
}
