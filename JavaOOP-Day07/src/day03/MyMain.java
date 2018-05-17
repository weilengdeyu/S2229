package day03;
/**2018年3月11日*/
public class MyMain {

	public static void main(String[] args) {
		
		//线程的优先级   1-10   默认为5
		
		Thread t1=new Thread(new FirstThread(),"子线程1");
		
		t1.start();
		
		Thread t2=new Thread(new FirstThread(),"子线程2");
		/*t2.setPriority(1);*/
		t2.start();
	}

}
