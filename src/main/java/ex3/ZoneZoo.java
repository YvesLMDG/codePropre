package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneZoo implements IZoneZoo {
	
	private List<Animal> animaux;
	private double coefficientNourriture;
	
	public ZoneZoo(double coefficientNourriture) {
		animaux = new ArrayList<>();
		setCoefficientNourriture(coefficientNourriture);
	}
	
	public void add(Animal animal) {
		getAnimaux().add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNomAnimal());
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return getAnimaux().size() * getCoefficientNourriture();
	}
	
	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	public double getCoefficientNourriture() {
		return coefficientNourriture;
	}

	public void setCoefficientNourriture(double coefficientNouriture) {
		this.coefficientNourriture = coefficientNouriture;
	}
 	
}
