 package day02;
/**2018��3��11��*/
public class SecondThread implements Runnable {

	@Override
	public void run() {
	   System.out.println("I am  runnable interface's run method ,ok!");
	   String tname = Thread.currentThread().getName();
		System.out.println(tname);
	}

}
