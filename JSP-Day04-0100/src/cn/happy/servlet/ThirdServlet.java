package cn.happy.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**2018��5��3��*/
@WebServlet(name="tdServlet",urlPatterns={"/tdServlet"},loadOnStartup=1)
public class ThirdServlet extends HttpServlet {
	//if anyone can answer this question,we can go home next class,and i will say nothing,OK?
	//doPost()  doGet() ��service()�й�ϵ���еĻ���ʲô��ϵ��
	//�������У�
	 //ʲô��ϵ��service()�ɷ�����������
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   doPost(req,resp);
	   System.out.println("===============");
    }
  
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
    
    }

}
