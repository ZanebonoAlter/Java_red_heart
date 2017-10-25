package java_3;

import java.util.Stack;

public class Player_fuction {
	public void sort(Stack<Card> player_stack){
		Stack<Card> temp_card = new Stack<>();
		//红桃5
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getKind().equals("红桃") && player_stack.get(i).getNumber().equals("5"))
				temp_card.push(player_stack.get(i));
		}
		//大小王
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getKind().equals("大王"))
				temp_card.push(player_stack.get(i));
		}
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getKind().equals("小王"))
				temp_card.push(player_stack.get(i));
		}
		//其他花色5
		for(int i = 0;i<player_stack.size();i++){
			if((!player_stack.get(i).getKind().equals("红桃")) && player_stack.get(i).getNumber().equals("5"))
				temp_card.push(player_stack.get(i));
			}
		//2
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getNumber().equals("2"))
				temp_card.push(player_stack.get(i));
			}
		//A
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getNumber().equals("A"))
				temp_card.push(player_stack.get(i));
			}
		//K
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getNumber().equals("K"))
				temp_card.push(player_stack.get(i));
			}
		//Q
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getNumber().equals("Q"))
				temp_card.push(player_stack.get(i));
			}
		//J
		for(int i = 0;i<player_stack.size();i++){
			if(player_stack.get(i).getNumber().equals("J"))
				temp_card.push(player_stack.get(i));
			}
		//3-10
		for(int i = 10;i>=3;i--){
			if (i==5)
				continue;
			for(int j=0;j<player_stack.size();j++){
				if(player_stack.get(j).getNumber().equals(String.valueOf(i)))
					temp_card.push(player_stack.get(j));
				}
			}
		//output
		for(int i = 0;i<player_stack.size();i++)
			System.out.print(temp_card.get(i).getKind()+temp_card.get(i).getNumber()+" ");
		System.out.println("");
		
	}
}
