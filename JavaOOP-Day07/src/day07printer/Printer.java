package day07printer;
/**2018年3月12日*/
public class Printer {
	public  void print1(){		
		synchronized(obj){
			System.out.print("微");
			System.out.print("冷");
			System.out.print("的");
			System.out.print("雨");
			System.out.println();	 
		}
	}
	Object obj=new Object();
	//推荐大家使用除了包装类型以外的任意的引用类型，都可以作为Lock对象，一般使用的比较多的是Object obj
	public  void print2(){
		synchronized(obj){
			System.out.print("好");
			System.out.print("人");
			System.out.println();		
		}
			
	}
}
