package day08;
/**2018��3��12��*/
public class MyMain {

	public static void main(String[] args) {
		 //
		Site site=new Site();
		//�̶߳���   �û�1
		Thread t1=new Thread(site);
		//�̶߳���   �û�2
		Thread t2=new Thread(site);
		
		//�̶߳���   �û�2
		Thread t3=new Thread(site);
		
		System.out.println("��ʼ��Ʊ");
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
