package model.impl;

import java.util.UUID;
import java.lang.StringBuilder;

import model.dec.CompteManip;
/**
*Model the concept of bank account.
*/

public final class CompteCourant extends Compte implements CompteManip {

	public CompteCourant(String owner, double initialBalance){
		super(owner, initialBalance);
	}

	public CompteCourant(String owner){
		super (owner);
	}

	@Override
	public double withdraw(double amount){
		double previous=this.getBalance();
		this.setBalance(previous - amount);
		

	}

	@Override
	public double deposit(double amount){
		double previous=this.getBalance();
			this.setBalance(previous + amount);
		return this.getBalance();
	}

	public double interet 
}