package day05join;
/**2018年3月11日*/
public class MyMain {

	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("线程A"+i);
					if (i==3) {
						System.out.println("线程礼让");
						Thread.yield();
					}
				}
			}
		});
		
		t1.start();
		
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("线程B"+i);
					if(i==3){
						System.out.println("线程礼让");
						Thread.yield();
					}
					
				}
			}
		});
		t2.start();
     
    

	}

}
