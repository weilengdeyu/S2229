package day08;
/**2018��3��12��*/
public class Site implements Runnable {
    private int count=10;//ʣ��Ʊ��
    private int num=0;  //�ڼ���Ʊ
	@Override
	public void run() {
		while(true){
			if(sale()==false){ //Ʊ�Ѿ�����
				break;
			}
		}
	}
	//��������һ������ sale
	public  boolean sale(){
		synchronized (this) {
			//�ж��Ƿ���ʣ���Ʊ
			if(count<=0){ //ûƱ��
				return false;
			}
			//��������ִ���߼�����Ʊ��>=1
			count--; //Ʊ������
			num++;
			System.out.println("��ǰ����"+Thread.currentThread().getName()+"������"+num+"��Ʊ��ʣ��Ʊ��Ϊ"+count);
			return true;
		}
	}
    
     
	
}
