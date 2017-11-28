package model.dec;

public interface CompteItf{

	 String getOwner();

	String getNum();

	String getNBalance();

	setBalance(double newBalance);

	double deposit(double amount);
	}