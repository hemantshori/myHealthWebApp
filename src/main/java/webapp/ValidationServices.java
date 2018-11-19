package webapp;

public class ValidationServices {
	
	public boolean checkValidUSer(String userName, String Password)
	{
		
		return userName.equalsIgnoreCase("hemant") && Password.equals("Password");
	
		
		
		
	}

}
