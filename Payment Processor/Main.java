class Main
{
	public static void main(String[] args)
	{
		CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("5605 9089 3893 3903","340","15th July 2024");
		PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPaymentStrategy);
		paymentProcessor.processPayments(1000);
		
		PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy("carolinjames6@gmail.com" , "djkdj");
		paymentProcessor.setPaymentStrategy(payPalPaymentStrategy);
		paymentProcessor.processPayments(50);
	}
}