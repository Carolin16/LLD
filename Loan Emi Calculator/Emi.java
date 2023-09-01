class Emi
{
	private double emi;
	private double amount;
	private int loanTenure;
	double getEmiInfo(double amount,int loanTenure)
	{
		this.amount = amount;
		this.loanTenure = loanTenure;
		this.emi = (this.amount)/(this.loanTenure * 12);
		return this.emi;
	}
}