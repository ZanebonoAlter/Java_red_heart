package java_3;

public class init_red_heart implements Runnable{
	private int number;
	public void run() {
		for(int i = 0;i<2;i++) {
			for(number=1;number<=13;number++) {
				Card temp_card = new Card();
				temp_card.setKind("ºìÌÒ");
				if(number==11) 
					temp_card.setNumber("J");
				else if(number==12)
					temp_card.setNumber("Q");
				else if(number==13)
					temp_card.setNumber("K");
				else if(number==1)
					temp_card.setNumber("A");
				else
					temp_card.setNumber(String.valueOf(number));
				init.stack.push(temp_card);
			}
		}
	}
}
