package day01;

import java.util.ArrayList;
/**2018��3��8��*/
public class Day01 {
    /**
     * ���߳�
     * ����̵߳ĸ���
     * �̣߳��ǡ����̣��������̵߳�ĸ�ף�����ִ���������С��λ
     * ���̣���һ�γ����ִ�У���һ�γ���Ļ
     * ���̣߳�����ͬʱ�ж���߳�ִ�У���ͬά�������е����ݡ���������⣩
     * 
     * 
     * 
		�����̵߳Ĵ���������
		�˽��̵߳�״̬
		�����̵߳��ȵĳ��÷���
     * @param args
     */
	public static void main(String[] args) {
		//ArrayList ����    �캣�ж�
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName()+"�߳�����");
		currentThread.setName("���߳�");
		System.out.println(currentThread.getName()+"�߳�����");
	}

}
