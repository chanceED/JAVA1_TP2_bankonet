package com.bankonet.model;

import java.util.UUID;

public class CompteCourant {
	
	private int identifiant;
	private String libelle;
	private Float solde;
	private Float decouvertAutorise;
	private static int nbComptesCourants=0;
		


	public CompteCourant(int identifiant, String libelle, Float solde,
			Float decouvertAutorise) {
		
		
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.solde = solde;
		this.decouvertAutorise = decouvertAutorise;
		//System.out.println(" id = "+identifiant+" solde  "+solde+ "\n\n");
		nbComptesCourants++;
		//System.out.println(nbComptesCourants);
		
	}


	public String toString(){
		return ("identifiant="+identifiant+ " solde =" +solde);
	}
	
	public int getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Float getSolde() {
		return solde;
	}


	public void setSolde(Float solde) {
		this.solde = solde;
	}


	public Float getDecouvertAutorise() {
		return decouvertAutorise;
	}


	public void setDecouvertAutorise(Float decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}


	public static int getNbComptesCourants() {
	
		return nbComptesCourants++;
	}


	public static void setNbComptesCourants(int nbComptesCourants) {
		CompteCourant.nbComptesCourants = nbComptesCourants;
	}
	
	
	
	
	
	

}
