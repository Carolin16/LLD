class PaymentProcessor
{
	private PaymentStrategy paymentStrategy;
	PaymentProcessor(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy = paymentStrategy;
	}
	public void setPaymentStrategy(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy  = paymentStrategy;
	}
	public void processPayments(double amount)
	{
		paymentStrategy.processPayments(amount);
	}
}