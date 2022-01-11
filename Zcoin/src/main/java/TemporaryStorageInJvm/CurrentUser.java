package TemporaryStorageInJvm;

public class CurrentUser
{
    static String Email;
    
    public static String getemail()
    {  
        return Email;  
    }  
    
    public void setemail(String NewEmail) 
    {  
        Email =NewEmail;  
    }   
}