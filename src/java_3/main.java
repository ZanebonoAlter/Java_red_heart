package java_3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		//��ʼ����
		new init();
		//�ȴ��߳̽���
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����
		Collections.shuffle(init.stack);
		//����
		new send_card();
		//�ȴ��߳̽���
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��������
		new Player_fuction().sort(player1.stack);
		new Player_fuction().sort(player2.stack);
		new Player_fuction().sort(player3.stack);
		new Player_fuction().sort(player4.stack);
		new Player_fuction().sort(init.stack);
	}

}
