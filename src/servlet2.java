import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;

public class servlet2 extends GenericServlet 
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		String n=request.getParameter("userName"); 
		out.print("Welcome "+n);
	}

}
