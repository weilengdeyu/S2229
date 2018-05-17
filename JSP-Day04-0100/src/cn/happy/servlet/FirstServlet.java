package cn.happy.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**2018年5月3日*/
/*@WebServlet("/firstServlet")*/
public class FirstServlet implements Servlet {

	@Override
	//初始化
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==========init============");
	}

	@Override
	//获取Servlet配置信息
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	//处理请求的核心方法
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      System.out.println("service");
	}

	@Override
	//获取Servlet信息
	public String getServletInfo() {
		return null;
	}

	@Override
	//销毁
	public void destroy() {
       System.out.println("destory");
	}

}
