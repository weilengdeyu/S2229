package day05join;
/**2018��3��11��*/
public class MyMain {

	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("�߳�A"+i);
					if (i==3) {
						System.out.println("�߳�����");
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
					System.out.println("�߳�B"+i);
					if(i==3){
						System.out.println("�߳�����");
						Thread.yield();
					}
					
				}
			}
		});
		t2.start();
     
    

	}

}
