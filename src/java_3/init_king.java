package java_3;

public class init_king implements Runnable{
	public void run() {
		for(int i =0;i<2;i++) {
			Card temp_card_1 = new Card();
			Card temp_card_2 = new Card();
			temp_card_1.setNumber("");
			temp_card_1.setKind("����");
			init.stack.push(temp_card_1);
			temp_card_2.setKind("С��");
			temp_card_2.setNumber("");
			init.stack.push(temp_card_2);
		}
	}

}
