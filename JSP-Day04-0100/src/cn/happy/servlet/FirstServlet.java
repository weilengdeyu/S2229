package cn.happy.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**2018��5��3��*/
/*@WebServlet("/firstServlet")*/
public class FirstServlet implements Servlet {

	@Override
	//��ʼ��
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==========init============");
	}

	@Override
	//��ȡServlet������Ϣ
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	//��������ĺ��ķ���
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      System.out.println("service");
	}

	@Override
	//��ȡServlet��Ϣ
	public String getServletInfo() {
		return null;
	}

	@Override
	//����
	public void destroy() {
       System.out.println("destory");
	}

}
