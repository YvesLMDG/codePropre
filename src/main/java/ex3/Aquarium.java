package ex3;

public class Aquarium extends ZoneZoo {
	
	public final static double COEFFICIENT_NOURITURE = 0.2;

	public double calculerKgsNourritureParJour(){
		return getAnimaux().size() * COEFFICIENT_NOURITURE;
	}
}
