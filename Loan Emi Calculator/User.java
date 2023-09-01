public class User
{
	String userId;
	String userName;
	String password;
	String email;
	void createUser(String userName , String password , String email)
	{
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	String getUserName()
	{
		return this.userName;
	}
}