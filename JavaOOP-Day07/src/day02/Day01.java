package day02;
/**2018Äê3ÔÂ11ÈÕ*/
public class Day01 {

	public static void main(String[] args) {
		
		System.out.println(" i am  main thread,OK!");
		FirstThread t1=new FirstThread();
		t1.start();
		
		
		SecondThread st=new SecondThread();
		Thread t2=new Thread(st);
		t2.start();
		

	}

}
