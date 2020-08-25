package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<String> stack = new ArrayList<>();
	
	public void push(String value) {
		this.stack.add(value);
	}
	
	public String pop() {
		return this.stack.remove(this.stack.size() - 1);
	}
}
