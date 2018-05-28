import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;

public class ShowMessage extends GenericServlet 
{
	PrintWriter p;
	int count;
	
	
	public void init(ServletConfig config)
	{
	    count=Integer.parseInt(config.getInitParameter("count"));	
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	      p=response.getWriter();
	      p.print("<html>");
	      p.print("<body>");
	      //p.print("Message from servlet");
	     count++;
	     p.print("Request Number: "+count);
	     p.print("</body>");
	     p.print("</html>");
	      
	}
	
	public void destroy()
	{
		p=null;
	}
    
}
