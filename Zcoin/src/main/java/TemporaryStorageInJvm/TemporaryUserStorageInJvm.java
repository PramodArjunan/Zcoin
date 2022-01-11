package TemporaryStorageInJvm;

import java.util.LinkedHashMap;
import java.util.Map;
public class TemporaryUserStorageInJvm 
{
    static Map<String,UserCreation> Users = new LinkedHashMap<>();
    
    public static void add(String Email,UserCreation E)
    {
        Users.put(Email,E);
    }
    
    public static UserCreation get(String Email)
    {
        return Users.get(Email);
    }
    
    public static void remove(String Email)
    {
        Users.remove(Email);
    }
    
    public static Map<String,UserCreation> getAll() 
    {
         return Users;
    } 
}