class BankAccount
{
	int accno;
	double balance;
	BankAccount()
	{
		balance=0;
		double interest=0;
	}
	BankAccount(double initialBalance, double initialInterest)
	{
		balance=initialBalance;
		interest=initialInterest;
	}
	void deposit(double amount)
	{
	balance=balance+amount;
	}
	void withdraw(double amount)
	{
		balance=balance-amount;
	}
	double getBalance()
	{
		return balance;
	}
	public static void main(String args[])
	{
		BankAccount savings=new BankAccount(1000, 0.10);
		savings.withdraw(250);
		savings.deposit(400);
		System.out.println(savings.getBalance());
	}
}


	
