package study06;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("상계동");
		stack.push("서초동");
		stack.push("불광동");
		stack.push("이문동");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}


	}

}
