package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**2018��3��13��*/
public class MyMain {

	//����  ������ʱ
	public static void main(String[] args) throws IOException {
	    //�������ķ���
		
		//���ķ��򣺣�������������
		
		
		//�������ͣ��ֽ�  ���ַ�
		
		//
		FileInputStream fis=new FileInputStream("readme.txt");  //2
		byte[] bytes=new byte[1024];
		//����������
		//��Ч�ֽ���
		int data  ;
		StringBuffer sb=new StringBuffer();
		while((data=fis.read(bytes))!=-1){
			  //�������ݿɶ�
			//��bytes  ת��   String
			String temp=new String(bytes,0,data);
			sb.append(temp);
		}
		System.out.println(sb.toString());
		fis.close();
		
		
		
		
		
		
		
		
		
	}

}
