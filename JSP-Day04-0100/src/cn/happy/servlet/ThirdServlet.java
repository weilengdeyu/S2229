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

/**2018年5月3日*/
@WebServlet(name="tdServlet",urlPatterns={"/tdServlet"},loadOnStartup=1)
public class ThirdServlet extends HttpServlet {
	//if anyone can answer this question,we can go home next class,and i will say nothing,OK?
	//doPost()  doGet() 和service()有关系吗？有的话，什么关系？
	//解析：有，
	 //什么关系：service()派发器：：：：
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   doPost(req,resp);
	   System.out.println("===============");
    }
  
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
    
    }

}
