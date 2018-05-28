import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;

public class ShowServlet extends GenericServlet 
{
     PrintWriter p;
     String username,password;
    /* 
     public void init(ServletConfig config)
     {
    	 username="";
    	 password="";
     }
     */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		p=response.getWriter();
		username=request.getParameter("username");
		password=request.getParameter("password");
		p.print("<html>");
		p.print("<body>");
		p.print("Given UserName:"+username);
		p.print("<br>");
		p.print("Given Password:"+password);
	}

}
