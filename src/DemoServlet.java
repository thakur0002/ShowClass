import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletContext;

public class DemoServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter(); 
		//creating ServletContext object 
		ServletContext context=getServletContext(); 
		//Getting the value of the initialization parameter and printing it 
		String driverName=context.getInitParameter("dname"); 
		pw.println("driver name is="+driverName); 
		pw.close(); 

    }
}