package ex02;

import java.util.ArrayList;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {
		int[] arr = {102, 32, 32, 65, 29, 236, 5, 44, 84, 52, 70, 52};
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i]) == false) {
				list.add(arr[i]);
			}
		}
	}
}
