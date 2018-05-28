import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

public class SecondSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		
		try
		{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        HttpSession session=request.getSession(true);  
	        String n=(String)session.getAttribute("uname");  
	        out.print("Hello "+n);
	        //session.setMaxInactiveInterval(100);
	        session.invalidate();
	        out.close();  
	  
	      }
		catch(Exception e)
		{
			System.out.println(e);
	    }  
		
		
	}

}
