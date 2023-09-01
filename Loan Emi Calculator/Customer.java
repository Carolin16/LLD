import java.util.*;
public class Customer extends User
{
	String customerAccountNo;
	Long phoneNo;
	Address address;
	LoanManagementSystem loanManager;
	void setCustomerAccountNo(String customerAccountNo)
	{
		this.customerAccountNo = customerAccountNo;
	}
	void setPhoneNo(Long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	void setAddress(Address address)
	{
		this.address = address;
	}
	void makeEMIPayment(double amount , PaymentMode mode)
	{
		this.loanManager.makePayments(this , amount , mode);
		
	}
	void getLoanInfo()
	{
		loanManager.getLoanInforCustomer(this);

	}
}