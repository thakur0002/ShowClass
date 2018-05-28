import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.PrintWriter;

public class DatabaseServlet1 extends HttpServlet 
{
	
	
	Connection con;
	PreparedStatement p;
	
	
	String username,password,databasepassword,status;
	ResultSet rs;
	int userid;
	PrintWriter pw;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
		  pw=response.getWriter();
          username=request.getParameter("username");			
          password=request.getParameter("password");
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
          p=con.prepareStatement("select userid,password from userauth where username=?");
          p.setString(1,username);
          rs=p.executeQuery();
          rs.next();
          userid=rs.getInt(1);
          databasepassword=rs.getString(2);
          
          if(password.equals(databasepassword))
          {
        	  HttpSession session=request.getSession();
        	  session.setAttribute("userid", new Integer(userid));
        	  status="Login Success";
          }
          else
          {
        	  status="Login Failed";
          }
          pw.println(status);
		}
		catch(ClassNotFoundException cl)
		{
			System.out.println(cl.getMessage());
		}
		catch(SQLException sq)
		{
			System.out.println(sq.getMessage());
		}
          
	}

}
