package ex1;

import java.util.Date;

/**
 * Classe stockant les informations d'une entreprise
 * 
 * @author YvesLMDG
 *
 */
public class Entreprise {

	public int Siret;
	public String Nom;
	public String adresse;
	public Date dateCreation;
	
	public static final int CAPITAL_MAX= 3_000_000;
	
	/**
	 * Affiche le statut de l'entreprise
	 */
	public void afficherStatut(){
		
	}

	public int getSiret() {
		return Siret;
	}

	public String getNom() {
		return Nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setSiret(int siret) {
		Siret = siret;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
