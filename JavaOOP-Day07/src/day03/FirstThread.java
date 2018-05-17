package day03;
/**2018年3月11日*/
public class FirstThread implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <10000; i++) {
			System.out.println("子线程"+Thread.currentThread().getName());
		}
		
	}

}
