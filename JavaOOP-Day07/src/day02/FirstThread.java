package day02;
/**2018��3��11��*/
//�̳�Thread
public class FirstThread extends Thread{
	@Override
	public void run() {
		System.out.println("I am child thread ,please many careful");
		String tname = Thread.currentThread().getName();
		System.out.println(tname);
	}
}
