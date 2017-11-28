package main;

import model.dec.CompteManip
import model.fact.CompteFactory;

public final class Main{
	public static void main(String[] ars){


	CompteFactory cf= new CompteFactory();

	CompteManip c1=cf.creatCompteCourant("John Doe");
	CompteManip c2=cf.creatCompteCourant("John Bauer");

	c1.deposit(1500.0d);
		double retrait=c1.withdraw(900.0d
		double nouveauSolde=c2.withdraw(100000.0d);		



	system.out.println(c1);
	system.out.print(c2.toSring());

	}
}