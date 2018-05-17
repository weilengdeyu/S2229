package day07printer;
/**2018年3月13日*/
public class MyThread extends Thread{
	//维护着一个打印机引用
    public Printer printer;
	
	
    @Override
	public void run() {
		for(int i=1;i<=500;i++){
			printer.print1();
		}
	}
}
