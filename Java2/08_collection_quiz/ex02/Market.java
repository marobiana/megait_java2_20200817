package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {
	// 상품 리스트
	private List<Goods> list = new ArrayList<>(); // 상품명 중복 불가

	// 1. 입력하는 메소드(Create)
	public void create(Goods goods) {
		// 등록된 상품명이 있는지 확인
		if (this.list.contains(goods)) {
			System.out.println("등록된 상품이 존재합니다.");
			return;
		}

		/*
		 * Iterator<Goods> iter = list.iterator(); while (iter.hasNext()) { Goods
		 * goodsOfList = iter.next(); // 등록된 상품명이 있는지 확인 if
		 * (goodsOfList.getName().equals(goods.getName())) {
		 * System.out.println("등록된 상품이 존재합니다."); return; // 등록된 상품이 존재하면 메소드를 끝내버린다. } }
		 */

		// 판매상태가 유효한지 확인
		if (goods.getState().equals("판매중") || goods.getState().equals("예약중")
				|| goods.getState().equals("판매완료")) {
			System.out.println(this.list.add(goods) ? "입력 성공" : "입력 실패");
		} else {
			System.out.println("판매상태가 유효하지 않습니다.");
		}

	}

	// 2. 출력하는 메소드(Read)
	public void read() {
		if (this.list.isEmpty()) {
			System.out.println("비어있습니다.");
			return;
		}

		System.out.println(this.list.toString());
	}


	// 3-1. 수정하는 메소드(Update) - 가격 (상품명으로) 
	public void updatePrice(String name, int price) {
		boolean existGoods = false; // 수정할 상품이 존재하고 있는지 여부
		Iterator<Goods> iter = this.list.iterator();
		while (iter.hasNext()) {
			Goods goodsOfList = iter.next();
			if (name.equals(goodsOfList.getName())) {
				existGoods = true;
				goodsOfList.setPrice(price);
				break;
			}
		}

		if (existGoods == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		}
	}

	// 3-2. 수정하는 메소드(Update) - 상태 (상품명으로) 
	public void updatePrice(String name, String state) {
		boolean existGoods = false; // 수정할 상품이 존재하고 있는지 여부
		Iterator<Goods> iter = this.list.iterator();
		while (iter.hasNext()) {
			Goods goodsOfList = iter.next();
			if (name.equals(goodsOfList.getName())) {
				existGoods = true;
				// 판매상태가 유효한지 확인
				if (state.equals("판매중") || state.equals("예약중") || state.equals("판매완료")) {
					goodsOfList.setState(state);
					break;
				}
			}
		}

		if (existGoods == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		}
	}

  // 4. 삭제하는 메소드(Delete)
	public void delete(String name) {
		boolean exist = false; // 상품 존재 여부
		Iterator<Goods> iter = this.list.iterator();
		while (iter.hasNext()) {
			Goods goodsOfList = iter.next();
			if (goodsOfList.getName().equals(name)) {
				// 삭제
				iter.remove();
				exist = true;
			}
		}

		if (exist == false) {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("삭제되었습니다.");
		}
	}

}
