package java_3;

public class send_card {
	public send_card() {
		Runnable player1 = new player1();
		Runnable player2 = new player2();
		Runnable player3 = new player3();
		Runnable player4 = new player4();
		
		Thread thread_1 = new Thread(player1);
		Thread thread_2 = new Thread(player2);
		Thread thread_3 = new Thread(player3);
		Thread thread_4 = new Thread(player4);
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		thread_4.start();
		
	}
}
