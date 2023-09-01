public class PayPalPaymentStrategy implements PaymentStrategy
{
	private String email;
	private String password;
	PayPalPaymentStrategy(String email , String password)
	{
		this.email = email;
		this.password = password;
	}
	public void processPayments(double Amount)
	{
		System.out.println("In paypal payment");
	}
}