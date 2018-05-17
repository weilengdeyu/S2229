package day07printer;
/**2018年3月13日*/
public class MyMain {

	public static void main(String[] args) {
	  //实例化线程变量
	   MyThread t1=new MyThread();
	  //实例化线程变量 
	   MyThread2 t2=new MyThread2();
	   //实例化打印机对象
	   Printer printer=new Printer();
	//线程A绑定打印机
	   t1.printer=printer;
	  //线程B绑定打印机
	   t2.printer=printer;
	   
	   
	   t1.start();
	   t2.start();

	}

}
