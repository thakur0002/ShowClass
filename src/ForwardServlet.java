import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.RequestDispatcher;

public class ForwardServlet extends GenericServlet 
{
	RequestDispatcher dispatcher;
	String username,password;
	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	      username=request.getParameter("username");
	      password=request.getParameter("password");
	      
	      if((username.compareTo("admin")==0)&&(password.compareTo("admin")==0))
	      {
	    	  dispatcher=request.getRequestDispatcher("Success.html");
	      }
	      else
	      {
	    	  dispatcher=request.getRequestDispatcher("Fail.html");
	      }
	      dispatcher.forward(request,response);
	}

}
