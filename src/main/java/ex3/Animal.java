package ex3;

public class Animal {

	private String nomAnimal;
	private TypeRegime regime;
	
	public Animal(String nomAnimal, TypeRegime regime) {
		super();
		setNomAnimal(nomAnimal);
		setRegime(regime);
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public TypeRegime getRegime() {
		return regime;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public void setRegime(TypeRegime regime) {
		this.regime = regime;
	}
	
}