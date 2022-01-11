import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import DatabaseInterface.Mysql;
import TemporaryStorageInJvm.CurrentUser;
import TemporaryStorageInJvm.TemporaryUserStorageInJvm;
import TemporaryStorageInJvm.UserCreation;

@WebServlet("/ConfirmAgentPassword")
public class ConfirmAgentPassword extends HttpServlet 
{
	 protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	 {
		 response.setContentType("text/html;charset=UTF-8");
		 Mysql mysql=new Mysql();
		 try 
		 {
	            String Email=CurrentUser.getemail();
	            UserCreation Account=TemporaryUserStorageInJvm.get(Email);           
	            String Password = request.getParameter("password");  
	           
	            if(Password.equals(UserCreation.getPassword()))
	            {
	            	// updating password for particular user by admin
	            	
	            	
	            	String query="select * from userinformation where zid='"+UserCreation.getAgentUserZid()+"'";
		            ResultSet rs=mysql.mysqlSelect(query);
		            
		            if(rs.next())
		            {
			            	String updatepassword="update userinformation set password='"+UserCreation.getAgentUserNewPassword()+"' where zid='"+UserCreation.getAgentUserZid()+"'";
			    			mysql.mysqlUpdate(updatepassword);
			    			
			    			Account.setAgentUserZid(0);
				            Account.setAgentUserNewPassword(null);
				            
				            
				            
				            Account.setMessage("userpasswordrestsuccess");
				            
				            JSONObject obj=new JSONObject();
				            obj.put("Status","Success");
		      	       	  	response.getWriter().print(obj);
		            }
		            else
		            {
		            	 	Account.setMessage("EnteredZidNotPresentToResetPassword");
				            
				            JSONObject obj=new JSONObject();
				            obj.put("Status","Success");
		      	       	  	response.getWriter().print(obj);
		            }
	            }
	            else
	            {
	            	  JSONObject obj=new JSONObject();
	            	  Account.setMessage("WrongPassword");
	      	       	  obj.put("Status","WrongPassword");
	      	       	  response.getWriter().print(obj);
	            
	            }
    
		 }
		 catch(Exception ex)
	     {
			 System.out.println("Exception");
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