package day08;
/**2018年3月12日*/
public class Site implements Runnable {
    private int count=10;//剩余票数
    private int num=0;  //第几张票
	@Override
	public void run() {
		while(true){
			if(sale()==false){ //票已经售完
				break;
			}
		}
	}
	//单独开了一个方法 sale
	public  boolean sale(){
		synchronized (this) {
			//判定是否有剩余的票
			if(count<=0){ //没票了
				return false;
			}
			//下面代码的执行逻辑就是票数>=1
			count--; //票数减少
			num++;
			System.out.println("当前窗口"+Thread.currentThread().getName()+"抢到了"+num+"号票，剩余票数为"+count);
			return true;
		}
	}
    
     
	
}
