package cn.happy.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**2018年5月3日*/
//just say onle once, 如果只有一个参数值，"/path" 默认指的是urlPatterns ，想跟其他参数，必须写出完整的参数键值。否则没有Intelligece

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
