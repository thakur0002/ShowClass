
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;

public class servlet1 extends GenericServlet 
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		String n=request.getParameter("userName"); 
		String p=request.getParameter("userPass"); 
		if(p.equals("servlet"))
		{ 
			RequestDispatcher rd=request.getRequestDispatcher("servlet2"); 
			rd.forward(request, response); 
		} 
		else
		{ 
			out.print("Sorry UserName or Password Error!"); 
			RequestDispatcher rd=request.getRequestDispatcher("/index.html"); 
			rd.include(request, response); 
		} 
		} 
	

}
