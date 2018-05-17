package day02;
/**2018Äê3ÔÂ11ÈÕ*/
//¼Ì³ĞThread
public class FirstThread extends Thread{
	@Override
	public void run() {
		System.out.println("I am child thread ,please many careful");
		String tname = Thread.currentThread().getName();
		System.out.println(tname);
	}
}
