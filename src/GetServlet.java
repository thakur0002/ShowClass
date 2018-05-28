import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class GetServlet extends HttpServlet 
{
	
	PrintWriter p;
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		   p=response.getWriter();
	       p.print("<html>");
	       p.print("<body>");
	       p.print("Message from Get Method");
	       p.print("</body>");
	       p.print("</html>");
	}

}
