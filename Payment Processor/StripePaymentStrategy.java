public class StripePaymentStrategy implements PaymentStrategy
{
	private String apiKey;
	StripePaymentStrategy(String apiKey)
	{
		this.apiKey = apiKey;
	}
	public void processPayments(double Amount)
	{
		System.out.println("In stripe payment");
	}
}