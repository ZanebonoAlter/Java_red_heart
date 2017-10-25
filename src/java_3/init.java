package java_3;

import java.util.Stack;

public class init {
	public static Stack<Card> stack=new Stack<>();
	
	public init() {
		Runnable init_red_heart = new init_red_heart();
		Runnable init_black_heart = new init_black_heart();
		Runnable init_red_block = new init_red_block();
		Runnable init_black_club = new init_black_club();
		Runnable init_king = new init_king();
		
		Thread thread1 = new Thread(init_red_heart);
		Thread thread2 = new Thread(init_black_heart);
		Thread thread3 = new Thread(init_red_block);
		Thread thread4 = new Thread(init_black_club);
		Thread thread5 = new Thread(init_king);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		
	}
}
