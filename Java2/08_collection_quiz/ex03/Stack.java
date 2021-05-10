package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<String> stack = new ArrayList<>();
	private int top = -1;
	
	public void push(String value) {
		this.stack.add(value);
		this.top++;
	}
	
	public String pop() {
		return this.stack.remove(this.stack.size() - 1);
		this.top--;
	}
	
	public String peek() {
		this.stack.get(this.top);	
	}
}
