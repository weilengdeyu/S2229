package day07printer;
/**2018��3��13��*/
public class MyMain {

	public static void main(String[] args) {
	  //ʵ�����̱߳���
	   MyThread t1=new MyThread();
	  //ʵ�����̱߳��� 
	   MyThread2 t2=new MyThread2();
	   //ʵ������ӡ������
	   Printer printer=new Printer();
	//�߳�A�󶨴�ӡ��
	   t1.printer=printer;
	  //�߳�B�󶨴�ӡ��
	   t2.printer=printer;
	   
	   
	   t1.start();
	   t2.start();

	}

}
