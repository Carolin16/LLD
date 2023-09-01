public class Loan
	{
		private int loanId;
		private double principalAmount;
		private double interestRate;
		private int loanTenure;
		private double simpleInterest;
		private double amount;
		Loan(double principalAmount,double interestRate,int loanTenure)
		{
			this.principalAmount = principalAmount;
			this.interestRate = interestRate;
			this.loanTenure = loanTenure;
		}
		public double getSimpleInterest(double principalAmount , double interestRate ,  int loanTenure)
		{
			this.simpleInterest = principalAmount * interestRate * loanTenure;
			return this.simpleInterest;
		}
		//amount is the total amount to be paid back after a tenure
		// amount = principal amount (amount borrowed) + interest for tenure
		public double getTotalAmountToRepay(int principalAmount , int simpleInterest)
		{
			this.amount = principalAmount + simpleInterest;
			return this.amount;
		}
		public void getLoanInfo(Loan loan)
		{
			System.out.println("Loan principal amount : "+loan.principalAmount);
			System.out.println("Loan Interest Rate : "+loan.interestRate);
			System.out.println("Loan loan tenure : "+loan.loanTenure);
			System.out.println("Amount to be paid : "+loan.amount);
		}
	}