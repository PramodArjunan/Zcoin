import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import TemporaryStorageInJvm.UserCreation;

@WebServlet("/PasswordVerification")
public class PasswordVerification extends HttpServlet 
{

	 protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	 {
		 response.setContentType("text/html;charset=UTF-8");	 
		 JSONObject obj=new JSONObject(); 
		 try 
		 {
	            String password = request.getParameter("password");
	           	            
            	//if the entered password and the password in the database are same means enter into the account 
	            
	            	if(password.equals(UserCreation.getPassword()))
	            	{
	           		    //if type =1 then agent
	            		if(UserCreation.getType()==1)
	            		{
	            			obj.put("Status","Agent");
	    	       	  	 	response.getWriter().print(obj);
	            		}
	            		//else user account
	            		else
	            		{        
	            			obj.put("Status","User");
	    	       	  	 	response.getWriter().print(obj);
	            		}
	            	}
	            	else
	            	{
	            		//if the entered password and the password in the database are not same means display error in the html page
	            		
	            		obj.put("Status","WrongPassword");
    	       	  	 	response.getWriter().print(obj);
	            	}
	            
		 }
		 catch(Exception ex)
	     {
	            System.out.println(ex);
	     }
	 }
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	 {
	
		processRequest(request, response);
	 } 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		processRequest(request, response);
	}

}