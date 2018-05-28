import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class PostServlet extends HttpServlet 
{
	PrintWriter p;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   p=response.getWriter();
	   p.print("<html>");
	   p.print("<body>");
	   p.print("Message from post method");
	   p.print("</body>");
	   p.print("</html>");
	}

}
