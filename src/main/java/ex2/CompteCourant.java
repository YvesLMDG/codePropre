package ex2;

/**
 * Classe représantant un compte bancaire ayant un découvert autorisé
 * 
 * @author YvesLMDG
 *
 */
public class CompteCourant extends CompteBancaire{

	/**
	 * Découvert authorisé
	 */
	private double decouvert;

	/**
	 * Créé un compte bancaire avec un solde initial et son découvert autorisé
	 * 
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		setDecouvert(decouvert);
	}
	
	/**
	 * Débite @param montant au solde si le solde reste supérieur au découvert authorisé
	 */
	public void debiterMontant(double montant){
		double soldeTemp = calculDebit(montant);
		if (soldeTemp < getDecouvert()) {
			setSolde(soldeTemp);
		}
	}
	
	public double getDecouvert() {
		return decouvert;
	}
	
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
}
