import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageServlet extends HttpServlet 
{
	  PrintWriter p;
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  p=response.getWriter();
	  p.print("<html>");
	  p.print("<body>");
	  p.print("Message");
	  p.print("</body>");
	  p.print("</html>");
	  p.close();
	}

}
