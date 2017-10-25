package java_3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		//初始化牌
		new init();
		//等待线程结束
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//打乱
		Collections.shuffle(init.stack);
		//发牌
		new send_card();
		//等待线程结束
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//整理后输出
		new Player_fuction().sort(player1.stack);
		new Player_fuction().sort(player2.stack);
		new Player_fuction().sort(player3.stack);
		new Player_fuction().sort(player4.stack);
		new Player_fuction().sort(init.stack);
	}

}
