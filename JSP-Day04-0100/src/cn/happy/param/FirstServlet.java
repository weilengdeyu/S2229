package cn.happy.param;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**2018Äê5ÔÂ5ÈÕ*/
public class FirstServlet extends HttpServlet {
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String value=getInitParameter("key");
	   System.out.println(value);
	   /*
	     String value = this.getServletContext().getInitParameter("key2");
	     System.out.println(value);*/
    }
   
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   doPost(req,resp);
   }
}
