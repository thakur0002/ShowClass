
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import java.io.PrintWriter;

public class InitialServlet extends GenericServlet 
{
	int count;
	PrintWriter p;
	
	
	public void init(ServletConfig config)
	{
         count=Integer.parseInt(config.getInitParameter("count"));
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		count++;
        p=response.getWriter();
        p.print("<html>");
        p.print("<body>");
        p.print(count);
        p.print("</body>");
        p.print("</html>");
	}
	public void destroy()
	{
		p=null;
		count=0;
	}

}
