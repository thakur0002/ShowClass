import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;


public class Message extends GenericServlet 
{
	PrintWriter p;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
       p=response.getWriter();
       p.print("<html>");
       p.print("<body>");
       p.print("Message from the servlet");
       p.print("</body>");
       p.print("</html>");
		 
	}

}
