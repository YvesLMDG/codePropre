package ex3;

public class SavaneAfricaine extends ZoneZoo {

	public final static double COEFFICIENT_NOURITURE = 10;
	
	public double calculerKgsNourritureParJour(){
		return getAnimaux().size() * COEFFICIENT_NOURITURE;
	}
}
