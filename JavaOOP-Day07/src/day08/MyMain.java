package day08;
/**2018年3月12日*/
public class MyMain {

	public static void main(String[] args) {
		 //
		Site site=new Site();
		//线程对象   用户1
		Thread t1=new Thread(site);
		//线程对象   用户2
		Thread t2=new Thread(site);
		
		//线程对象   用户2
		Thread t3=new Thread(site);
		
		System.out.println("开始抢票");
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
