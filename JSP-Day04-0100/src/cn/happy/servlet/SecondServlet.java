package cn.happy.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**2018��5��3��*/
//just say onle once, ���ֻ��һ������ֵ��"/path" Ĭ��ָ����urlPatterns �������������������д�������Ĳ�����ֵ������û��Intelligece

@WebServlet(name="secondServlet",urlPatterns={"/secondServlet"},loadOnStartup=1)
public class SecondServlet  extends GenericServlet{
	
	@Override
	public void init() throws ServletException {
	   System.out.println("second init");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
		
	}
}
