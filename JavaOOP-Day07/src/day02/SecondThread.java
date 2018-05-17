 package day02;
/**2018Äê3ÔÂ11ÈÕ*/
public class SecondThread implements Runnable {

	@Override
	public void run() {
	   System.out.println("I am  runnable interface's run method ,ok!");
	   String tname = Thread.currentThread().getName();
		System.out.println(tname);
	}

}
