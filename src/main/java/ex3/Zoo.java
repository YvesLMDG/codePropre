package ex3;

public class Zoo {

	private String nom;
	private IZoneZoo aquarium;
	private IZoneZoo fermeReptile;
	private IZoneZoo savaneAfricaine;
	private IZoneZoo zoneCarnivore;
	
	public Zoo(String nom){
		setNom(nom);
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore = new ZoneCarnivore();
		fermeReptile = new FermeReptile();
		aquarium = new Aquarium();
	}
	
	public void addAnimal(Poisson poisson){
		getAquarium().add(poisson);
	}
	
	public void addAnimal(Serpent reptile){
		getFermeReptile().add(reptile);
	}
	
	public void addAnimal(MammifereHerbivore mammifereHerbivore){
		getSavaneAfricaine().add(mammifereHerbivore);
	}
	
	public void addAnimal(MammifereCarnivore mammifereCarnivore){
		getZoneCarnivore().add(mammifereCarnivore);
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public IZoneZoo getSavaneAfricaine() {
		return savaneAfricaine;
	}

	public IZoneZoo getZoneCarnivore() {
		return zoneCarnivore;
	}

	public IZoneZoo getFermeReptile() {
		return fermeReptile;
	}

	public IZoneZoo getAquarium() {
		return aquarium;
	}

	public void setSavaneAfricaine(IZoneZoo savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	public void setZoneCarnivore(IZoneZoo zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	public void setFermeReptile(IZoneZoo fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public void setAquarium(IZoneZoo aquarium) {
		this.aquarium = aquarium;
	}
	
}
