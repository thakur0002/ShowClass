import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class FirstCookieServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
	    {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String n=request.getParameter("userName");
	    out.print("Welcome "+n);

	    Cookie ck=new Cookie("uname",n);//creating cookie object
	    response.addCookie(ck);//adding cookie in the response

	    //creating submit button
	    out.print("<form action='SecondCookieServlet'>");
	    out.print("<input type='submit' value='go'>");
	    out.print("</form>");

	    out.close();

	        }
	        catch(Exception e){System.out.println(e);}

	}

}
