package Ex02;

public class CellphoneTest {

	public static void main(String[] args) {
		// test
		Cellphone cellphone1 = new Cellphone();
		System.out.println(cellphone1.color);
		System.out.println(cellphone1.maker);
		System.out.println(cellphone1.price);
		System.out.println(cellphone1.model);
		
		cellphone1.call();
		cellphone1.camera();
		
		Cellphone[] cellphones = new Cellphone[100];
		for (int i = 0; i < 100; i++) {
			cellphones[i] = new Cellphone();
		}
		
		//cellphone1.maker = "samsung";
		//cellphone1.model = "z flip";
		//System.out.println(cellphone1.maker);
		//System.out.println(cellphone1.model);
		
    		cellphone1.setMaker("samsung");
    		String maker = cellphone1.getMaker();
		System.out.println(maker);
	}

}
