package day04sleep;
/**2018年3月11日*/
public class MyMain {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("子线程啊！！！！！！！"+i);
				}
				
			}
		}).start();

	}

}
