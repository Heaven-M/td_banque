package model.impl;

import java.util.UUID;
import java.lang.StringBuilder;

import model.dec.CompteItf; // car CompteItf(dans le package de déclaration) n'est pas dans le mm package que Compte(package de définition)

/**
*Model the concept of bank account.
*/

public abstract class Compte implements CompteItf {

	private final String owner;
	private final String num;
	private double balance;

	public Compte(String owner, double initialBalance) {
		this.owner=owner;
		this.balance=initialBalance;
		this.num=UUID.randomUUID().toString();

	}

	public Compte(String owner){
		this(owner,0.0d);
	}

	public String getOwner(){return this.owner;}//ou return owner

	public String getNum(){return this.num;}

	public String getNBalance() {return this.balance;}

	public void setBalance(double newBalance) {this.balance=newBalance;}

	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Compte  ").append(num).append("\n")
		  .append("Owner:  ").append(owner).append("\n")
		  .append("Balance:  ").append(balance.append("\"n");
		 return sb.toString();
	}

	@Override
	public boolean equals(Object other){
		if(other.geClass().getCanonicalName().equals(this.hetClass().getCanonicalName()))
			return false;
		Compte c=(Compte)other;
		return this.num.equals(other.num) && this.owner.equals(c.owner);

	}

	public abstract double withdraw(double amount);

	public abstract double deposit(double amount);

	
}




