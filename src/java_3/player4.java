package java_3;

import java.util.Stack;

public class player4 implements Runnable{
	public static Stack<Card> stack= new Stack<>(); 
	public void run() {
		for(int i =0;i<25;i++) 
			stack.push(init.stack.pop());
	}
}
