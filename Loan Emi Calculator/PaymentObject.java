class PaymentObject
{
	int transactionId;
	double amount;
	PaymentStatus status;
	PaymentMode mode;
	PaymentObject(double amount , PaymentStatus status , PaymentMode mode)
	{
		this.amount = amount;
		this.status = status;
		this.mode = mode;
	}
}
