import java.io.IOException;
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

@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	 {
		 response.setContentType("text/html;charset=UTF-8");
		 Mysql mysql=new Mysql();
		 try 
		 {	    
			 	//storing deposit amount in jvm
	            String Email=CurrentUser.getemail();	            
	            UserCreation Account=TemporaryUserStorageInJvm.get(Email);
	            String CurrentPassword = request.getParameter("currentpassword");  
	            String NewPassword = request.getParameter("newpassword");
	            if((UserCreation.getPassword()).equals(CurrentPassword))
	            {
	            	String updatepassword="update userinformation set password='"+NewPassword+"' where email='"+Email+"'";
	    			mysql.mysqlUpdate(updatepassword);  			
	                Account.setPassword(NewPassword);
	                
	                JSONObject obj=new JSONObject();
	       	  		obj.put("Status","Success");
	       	  	 	response.getWriter().print(obj);
	       	  	}
	            else
	            { 
	                JSONObject obj=new JSONObject();
	       	  		obj.put("Status","Failed");
	       	  	 	response.getWriter().print(obj);
		        }
	                     
		 }
		 catch(Exception ex)
	     {
	            System.out.println(ex);
	     }
	 }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}