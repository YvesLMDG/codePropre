package ex2;


/**
 * Classe Représantant un compte bancaire avec un taux de rémunération
 *  annuel sans découvert aurtorisé
 *   
 * @author YvesLMDG
 *
 */
public class LivretA extends CompteBancaire {

	/**
	 * Taux de rémunération annuel
	 */
	private double tauxRemuneration;
	
	/**
	 * Créé un compte bancaire avec un solde initial et son taux de rémunération annuel
	 * 
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		setTauxRemuneration(tauxRemuneration);
	}

	/**
	 * Débite @param montant du solde si le solde reste positif
	 */
	public void debiterMontant(double montant){
		double soldeTemp = calculDebit(montant);;
		if (soldeTemp > 0){
			setSolde(soldeTemp);

		}
	}
	
	/**
	 * Calcul et applique au solde du compte le taux de rémunération annuel
	 */
	public void appliquerRemuAnnuelle(){
		setSolde(getSolde()*getTauxRemuneration()/100);

	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
