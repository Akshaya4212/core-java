package myprograms;

import java.util.Stack;
public class StackProgram {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("Book");
		stack.push("noteBook");
		stack.push("pen");
		
		System.out.println("top item:" +stack.peek());
		System.out.println("popped" +stack.pop());
		System.out.println("stack after pop" +stack);
		
		//check if stack is empty
		if(stack.isEmpty()) {
			System.out.println("stack is empty:");
			
		}else {
			System.out.println("stack is not empty:");
		}
		
		// TODO Auto-generated method stub

	}

}
