package day07printer;
/**2018��3��12��*/
public class Printer {
	public  void print1(){		
		synchronized(obj){
			System.out.print("΢");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println();	 
		}
	}
	Object obj=new Object();
	//�Ƽ����ʹ�ó��˰�װ���������������������ͣ���������ΪLock����һ��ʹ�õıȽ϶����Object obj
	public  void print2(){
		synchronized(obj){
			System.out.print("��");
			System.out.print("��");
			System.out.println();		
		}
			
	}
}
