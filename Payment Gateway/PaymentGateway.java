public class PaymentGateway
{
	
	
}

class User
{
	String id;
	public void create(Transaction t) 
	{
		
	}
}

class Bank
{
	String id;
	String address;
	String metaData;
}


class Account
{
	String id;
	Bank bank;
	User user;
}
class Amount
{
	double value;
	Currency currency;
}
enum PaymentMode
{
	CARD,UPI,BANK_TRANSFER,GIFT;
}


class Transaction
{
	Status state;
	String id;
	Amount amount;
	//transaction has a to and from
	Account senderAccount;
	Account recieverAccount;
	String desc;
	PaymentMode payMode;
	public void changeStatus(State newState)
	{
		state = newState;
		//we do not know whats the current state of object
		state.notifyUsers(senderAccount , recieverAccount , oldState);
	}
}


enum StateName
{
	SUCCESSFUL,FAIL,IN_PROGRESS,ON_HOLD;
}
/*State transaction management*/
Abstract class State 
{
	StateName transactionState;
	abstract void notifyUsers(Account senderAccount , Account recieverAccount , State oldState);
}
/*concrete classes*/
class SuccessTransaction extends State
{
	public void notifyUsers(Account senderAccount , Account recieverAccount , State oldState)
	{
		if(oldState.equals(StateName.IN_PROGRESS))
		{
			
		}
		else if(oldState.equals(StateName.HOLD))
		{
			
		}
	}
}
class FailedTransaction extends State
{
	public void notifyUsers(Account senderAccount , Account recieverAccount , State oldState)
	{
		if(oldState.equals(StateName.IN_PROGRESS))
		{
			
		}
		else if(oldState.equals(StateName.HOLD))
		{
			
		}
	}
}


class RuleEngine
{
	Strategy strategy;
	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}
	//Based on type of transaction , validate transaction
	public boolean validate(Transaction t)
	{
		return strategy.validate(t);
	}
	public boolean isFraud(Transaction t)
	{
		return false;
	}
}
interface Strategy
{
	StrategyName strategyName;
	boolean validate(Transaction t); 
}
//concrete classes
public class Cash implements Strategy
{
	public boolean validate(Transaction t)
	{
		return t.amount<=100;
	}
}
public class Online  implements Strategy
{
	public boolean validate(Transaction t)
	{
		return t.amount<=1000;
	}
}

public class Strict implements Strategy
{
	public boolean validate(Transaction t)
	{
		return t.amount<=10;
	}
}

public class Simple implements Strategy
{
	public boolean validate(Transaction t)
	{
		return true;
	}
}
enum StrategyName
{
	CASH , CROSS_COUNTRY , ONLINE;
}


