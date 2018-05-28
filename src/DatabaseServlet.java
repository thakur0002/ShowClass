import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseServlet extends GenericServlet 
{
	Connection con;
	PreparedStatement p;
	String name,standard,university;
	int number;
	
	
    	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
    	{ 
    		try
    		{
              name=request.getParameter("name");			
              number=Integer.parseInt(request.getParameter("number"));
              standard=request.getParameter("standard");
              university=request.getParameter("university");
              
              //Database Connection started here
              
              
              
    		  Class.forName("oracle.jdbc.driver.OracleDriver");
              con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
              p=con.prepareStatement("insert into student values(?,?,?,?)");
             //ResultSet r=s.executeQuery("select * from student");
              
              //if(r.next()==false)
            	//  System.out.println("No Data found in the database");
              
              p.setString(1,name);
              p.setInt(2,number);
              p.setString(3,standard);
              p.setString(4,university);
              p.executeUpdate();
              System.out.println("Successfully inserted into database");
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
    	public void destroy()
    	{
    		con=null;
    		
    	}

}
