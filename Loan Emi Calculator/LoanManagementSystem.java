import java.util.*;
public class LoanManagementSystem
{
	Loan loan;
	Customer customer;
	PaymentObject paymentObj;
	private Map<Customer , List<Loan>> customerToLoanMapping;
	private Map<Customer , List<PaymentObject>> customerPaymentDetails;
	Emi emi;
	LoanManagementSystem()
	{
		
	}
	public void addLoan(Customer customer , Loan loan)
	{
		if(!customerToLoanMapping.containsKey(customer))
		{
			customerToLoanMapping = new HashMap<>();
		}
	customerToLoanMapping.get(customer).add(loan);
	}
	void makePayments(Customer customer , double amountToPay , PaymentMode mode)
	{
		List<Loan> loans = customerToLoanMapping.get(customer);
		for(Loan loan:loans)
		{
			if(loan.equals(loan))
			{
				List<PaymentObject>> paymentDetails = customerPaymentDetails.get(customer);
				customerPaymentDetails.put(customer , paymentDetails.add(new PaymentObject(amountToPay , PaymentStatus.success, mode)));
			}
		}
		getEmiPayments(customer);
	}
	public void getLoanInfoForAllCustomers()
	{
		for(Map.Entry<Customer , List<Loan>> entry : map.entrySet())
		{
			System.out.println("Customer : " + entry.getKey().getUserName());
			for(Loan loan : entry.getValue())
			{
				System.out.println("Loan details : " + loan.getLoanInfo(loan));
			}
		}
	}
	public void getLoanInforCustomer(Customer customer)
	{
		List<Loan> res = new ArrayList<>();
		if(!map.containsKey(customer))
		{
			System.out.println("No customer");
			return;
		}
		res =  map.get(customer);
		for(Loan loan : res)
		{
			loan.getLoanInfo(loan);
		}
	}
	public void getEmiPayments(Customer customer)
	{
		List<PaymentObject> res = map.get(customer);
		for(PaymentObject payObj : res)
		{
			System.out.println("Payment details : ");
			System.out.println("Payment Amount : " + payment.amount);
			System.out.println("Payment Status : " + payment.status);
			System.out.println("Payment Mode : "+payment.mode);
		}
	}

}