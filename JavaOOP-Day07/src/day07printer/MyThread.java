package day07printer;
/**2018��3��13��*/
public class MyThread extends Thread{
	//ά����һ����ӡ������
    public Printer printer;
	
	
    @Override
	public void run() {
		for(int i=1;i<=500;i++){
			printer.print1();
		}
	}
}
