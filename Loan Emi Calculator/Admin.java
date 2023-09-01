import java.util.*;
public class Admin extends User
{
	LoanManagementSystem loanManager;
	Admin(String userName)
	{
		this.userName = userName;
	}

	void createLoan(Customer customer , double principalAmount , double interestRate , int loanTenure)
	{
		Loan loan = new Loan(principalAmount , interestRate , loanTenure);
		loanManager.addLoan(customer , loan);
	}
	void getAllLoanInfo()
	{

	}
}