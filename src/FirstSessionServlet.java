import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class FirstSessionServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
        {

          response.setContentType("text/html");
          PrintWriter out = response.getWriter();

          String n=request.getParameter("userName");
          String p=request.getParameter("password");
        //out.print("Welcome "+n);

          HttpSession session=request.getSession();
          session.setAttribute("uname",n);
          session.setAttribute("password",p);

        out.print("<a href='SecondSessionServlet'>visit</a>");

        out.close();

        }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
