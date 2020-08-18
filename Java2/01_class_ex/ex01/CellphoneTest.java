package ex01;

public class CellphoneTest {

	public static void main(String[] args) {
		Cellphone cellphone1 = new Cellphone();
//		System.out.println(cellphone1.maker);
//		System.out.println(cellphone1.model);
//		System.out.println(cellphone1.color);
		
		cellphone1.call();
		cellphone1.camera();
		
		Cellphone[] cellphones = new Cellphone[100];
		for (int i = 0; i < cellphones.length; i++) {
			cellphones[i] = new Cellphone();
		}
		
		//cellphone1.maker = "samsung";
		//cellphone1.model = "z flip";
		String maker = cellphone1.getMaker();
		System.out.println(maker);
		cellphone1.setMaker("samsung");
		
		String maker1 = cellphone1.getMaker();
		System.out.println(maker1);
	}

}
