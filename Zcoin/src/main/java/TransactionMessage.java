import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import TemporaryStorageInJvm.CurrentUser;
import TemporaryStorageInJvm.TemporaryUserStorageInJvm;
import TemporaryStorageInJvm.UserCreation;


@WebServlet("/TransactionMessage")
public class TransactionMessage extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	 {
		 response.setContentType("text/html;charset=UTF-8");
		 JSONObject obj=new JSONObject();
		 String message=UserCreation.getMessaage();
		 String zid=UserCreation.getAccessGivenTo();
		 String Email=CurrentUser.getemail();
		 UserCreation Account=TemporaryUserStorageInJvm.get(Email);
		 
		 Account.setMessage(null);
         Account.setAccessGivenTo(null);
         
		 obj.put("Status",message);
  		 obj.put("AccessGivenTo",zid);
		 response.getWriter().print(obj);
	 }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
