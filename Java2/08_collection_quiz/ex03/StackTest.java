package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("빨");
		stack.push("주");
		stack.push("노");
		stack.push("초");
		stack.push("파");
		stack.push("남");
		stack.push("보");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
