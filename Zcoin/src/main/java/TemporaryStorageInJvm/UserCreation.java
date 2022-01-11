package TemporaryStorageInJvm;

public class UserCreation 
{
    private static String Name,Email,Hid,Password,AgentUserNewPassword,ResetPassword,Message,AccessGivenTo;
    private static long Phone;
    private static int Rc,Zid,Deposit,Withdraw,SendZid,ZidAmount,Type,AgentUserZid;
    private static Boolean Access;
    
    
    public static String getAccessGivenTo()
    {  
        return AccessGivenTo;  
    }  
    public void setAccessGivenTo(String NewAccessGivenTo) 
    {  
    	AccessGivenTo =NewAccessGivenTo;  
    }
    
    
   //Message
    
    public static String getMessaage()
    {  
        return Message;  
    }  
    
    public void setMessage(String NewMessage) 
    {  
    	Message =NewMessage;  
    }
    
    
    //reset password of the particular user
    
    public static String getResetPassword()
    {  
        return ResetPassword;  
    }  
    
    public void setResetPassword(String NewResetPassword) 
    {  
        ResetPassword =NewResetPassword;  
    }
    
    //access of the user 1=have access 0=not have access
    
    public static Boolean getAccess()
    {  
        return Access;  
    }  
    
    public void setaccess(Boolean NewAccess) 
    {  
        Access =NewAccess;  
    }
    
    //agent resting password to particularuser
    
    public static int getAgentUserZid()
    {  
        return AgentUserZid;  
    }  
    
    public void setAgentUserZid(int NewAgentUserZid) 
    {  
        AgentUserZid =NewAgentUserZid;  
    }
    
    //agent reseting password to particular user
    
    public static String getAgentUserNewPassword()
    {  
        return AgentUserNewPassword;  
    }  
    
    public void setAgentUserNewPassword(String NewAgentUserNewPassword) 
    {  
        AgentUserNewPassword =NewAgentUserNewPassword;  
    }
    
    //type of the account 1=admin
    
    public static int getType()
    {  
        return Type;  
    }  
    public void setType(int NewType) 
    {  
        Type =NewType;  
    }
    
    
    //user sending amount to particlar zid
    
    public static int getSendZid()
    {  
        return SendZid;  
    }  
    
    public void setSendZid(int NewSendZid) 
    {  
        SendZid =NewSendZid;  
    }
    
    //amount send to particular zid
    
    public static int getZidAmount()
    {  
        return ZidAmount;  
    }  
    
    public void setZidAmount(int NewZidAmount) 
    {  
        ZidAmount =NewZidAmount;  
    }
    
    //deposit amount of the user
    
    public static int getDeposit()
    {  
        return Deposit;  
    }  
    
    public void setDeposit(int NewDeposit) 
    {  
        Deposit =NewDeposit;  
    }
    
    //withdraw amount of the user
    
    public static int getWithdraw()
    {  
        return Withdraw;  
    }  
    
    public void setWithdraw(int NewWithdraw) 
    {  
        Withdraw =NewWithdraw;  
    }
    
    //name of the user 
     
    public static String getName()
    {  
        return Name;  
    }  
    
    public void setName(String newName) 
    {  
        Name =newName;  
    }  
    
    //phone number of the user
    
    public static long getPhone()
    {  
        return Phone;  
    }    
    public void setPhone(long NewPhone) 
    {  
        Phone =NewPhone;  
    }
    
    //email of the user
    
    public static String getEmail()
    {  
        return Email;  
    }  
    
    public void setemail(String NewEmail) 
    {  
        Email =NewEmail;  
    }  
    
    // hid of the user
    
    public static String getHid()
    {  
        return Hid;  
    }  
    
    public void sethid(String NewHid) 
    {  
        Hid =NewHid;  
    }  
    
    //balance of the user
    
    public static int getRc()
    {  
        return Rc;  
    }  
    
    public void setRc(int NewRc) 
    {  
        Rc =NewRc;  
    }  
    
    //zid of the user
    
    public static int getZid()
    {  
        return Zid;  
    }  
    
    public void setZid(int NewZid) 
    {  
        Zid =NewZid;  
    }  
    
    //password of the particular user
    
    public static String getPassword()
    {  
        return Password;  
    }  
    
    public void setPassword(String NewPassword) 
    {  
        Password =NewPassword;  
    }
}