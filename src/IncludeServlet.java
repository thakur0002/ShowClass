import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.RequestDispatcher;

public class IncludeServlet extends GenericServlet 
{
	RequestDispatcher dispatcher;
	String username,password;
	PrintWriter p;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	    username=request.getParameter("username");
	    password=request.getParameter("password");
	    
	    if((username.compareTo("admin")==0)&&(password.compareTo("admin")==0))
	      {
	    	  dispatcher=request.getRequestDispatcher("Success.html");
	    	  dispatcher.forward(request, response);
	      }
	      else
	      {
	    	  dispatcher=request.getRequestDispatcher("IncludeHtml.html");
	    	  dispatcher.include(request,response);
	     }
	      
	}

}
