package ex2;

/** Classe abstraite représantant un compte bancaire
 * 
 * @author YvesLMDG
 */
public abstract class CompteBancaire {

	/**
	 * Solde du compte
	 */
	private double solde;

	/**
	 * Crée un compte bancaire avec un solde de départ
	 * 
	 * @param solde
	 */
	public CompteBancaire(double solde) {
		super();
		this.solde = solde;
	}

	/** Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}

	/** Retourne quel serait le nouveau solde après débit du montant
	 *  
	 * @param montant
	 * @return solde après débit
	 *  
	 **/	 
	public double calculDebit(double montant) {
		return getSolde() - montant;
	}
	
	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
}
