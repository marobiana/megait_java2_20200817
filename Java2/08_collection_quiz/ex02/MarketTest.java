package ex01;

public class MarketTest {

	public static void main(String[] args) {
		// 마켓을 생성
		// 상품을 만들고
		// 상품 입력
		// 수정
		// 삭제
		Goods goods1 = new Goods("가방", 300000, "판매중");
		Goods goods2 = new Goods("가방", 300000, "판매중");
		Market market = new Market();
		market.create(goods1);
		market.create(goods2);
		market.read();
		
//		market.update("가방", 100000);
//		market.update("가방", "예약중");
	}
}
