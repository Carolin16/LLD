public class Main
{
	public static void main(String[] args)
	{
		Customer user = new Customer();
		user.createUser("Carolin" , "Carolin" , "Carolin");
		user.setCustomerAccountNo("8990 8927 8291 2902");
		user.setPhoneNo(892827829L);
		Address address = new Address(682021 , "gandhi nagar","kochi" , "kerala", "India");
		user.setAddress(address);
		
		Admin admin = new Admin("Admin manager");
		admin.createLoan(user,20000,8.12,4);
	}
}