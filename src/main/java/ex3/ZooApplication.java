package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new MammifereHerbivore("Gazelle", TypeRegime.HERBIVORE));
		zoo.addAnimal(new MammifereHerbivore("zèbre", TypeRegime.HERBIVORE));
		zoo.addAnimal(new MammifereCarnivore("Panthère", TypeRegime.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin", TypeRegime.HERBIVORE));
		zoo.addAnimal(new Poisson("Truite dorée", TypeRegime.HERBIVORE));
		zoo.addAnimal(new Serpent("Boa constrictor", TypeRegime.CARNIVORE));
		zoo.addAnimal(new Serpent("Python", TypeRegime.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}
