import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class HiddenServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

     //Getting the value from the hidden field
        String n=request.getParameter("uname");
        
        /*presentation logic*/
        
        out.print("<html>");
        out.print("<body>");
        out.print("<table>");
        out.print("Hello "+n);
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
       

       out.close();
     }
     catch(Exception e){System.out.println(e);
     }	
		
		
	}

}
