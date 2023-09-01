public class CreditCardPaymentStrategy implements PaymentStrategy
{
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	CreditCardPaymentStrategy(String cardNumber , String cvv , String expiryDate)
	{
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	public void processPayments(double Amount)
	{
		System.out.println("In credit card payment");
	}
}