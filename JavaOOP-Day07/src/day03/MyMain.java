package day03;
/**2018��3��11��*/
public class MyMain {

	public static void main(String[] args) {
		
		//�̵߳����ȼ�   1-10   Ĭ��Ϊ5
		
		Thread t1=new Thread(new FirstThread(),"���߳�1");
		
		t1.start();
		
		Thread t2=new Thread(new FirstThread(),"���߳�2");
		/*t2.setPriority(1);*/
		t2.start();
	}

}
