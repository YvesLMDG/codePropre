package ex3;

public class ZoneCarnivore extends ZoneZoo {

	public final static double COEFFICIENT_NOURITURE = 0.1;
	
	public double calculerKgsNourritureParJour(){
		return getAnimaux().size() * COEFFICIENT_NOURITURE;
	}
}
