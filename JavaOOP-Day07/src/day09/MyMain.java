package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**2018年3月13日*/
public class MyMain {

	//见过  ：编译时
	public static void main(String[] args) throws IOException {
	    //流：流的分类
		
		//流的方向：：：：输入和输出
		
		
		//数据类型：字节  和字符
		
		//
		FileInputStream fis=new FileInputStream("readme.txt");  //2
		byte[] bytes=new byte[1024];
		//真正的数据
		//有效字节数
		int data  ;
		StringBuffer sb=new StringBuffer();
		while((data=fis.read(bytes))!=-1){
			  //还有数据可读
			//将bytes  转成   String
			String temp=new String(bytes,0,data);
			sb.append(temp);
		}
		System.out.println(sb.toString());
		fis.close();
		
		
		
		
		
		
		
		
		
	}

}
