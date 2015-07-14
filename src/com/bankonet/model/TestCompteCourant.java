package com.bankonet.model;

public class TestCompteCourant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CompteCourant compteCourant1=new CompteCourant(1, "livret A", 600.0f, 20.0f);
		CompteCourant compteCourant2=new CompteCourant(2, "LIVRET JEUNE", 900.0f, 20.0f);
		CompteCourant compteCourant3=new CompteCourant(3, "toto", 600.0f, 20.0f);
		CompteCourant compteCourant4=new CompteCourant(4, "totA", 700.0f, 20.0f);
		CompteCourant compteCourant5=new CompteCourant(5, "totA", 7500.0f, 250.0f);
		
		
		System.out.println(compteCourant1.toString());
		System.out.println(compteCourant2.toString());
		System.out.println(compteCourant3.toString());
		System.out.println(compteCourant4.toString());
		System.out.println(compteCourant5.toString());
		System.out.println();
		
		System.out.println("Nombre total de comptes crées= "+CompteCourant.getNbComptesCourants());
	
		
	}

}


 