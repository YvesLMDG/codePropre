package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneZoo implements IZoneZoo {
	
	private List<Animal> animaux;
	
	public ZoneZoo() {
		animaux = new ArrayList<>();
	}
	
	public void add(Animal animal) {
		getAnimaux().add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNomAnimal());
		}
	}
	
	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
 	
}
