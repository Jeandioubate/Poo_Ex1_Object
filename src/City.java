

public class City {
/*	
	// Attributs
	public String name;
	public String country;
	public int nbInhabitants;
	
	// Constructeurs
	public City(String name, String country, int nbInhabitants) {
		this.name = name;
		this.country = country;
		this.nbInhabitants = nbInhabitants;
	}
	
	// Affichage	
	public void displayInfo() {
		System.out.println("Ville : " + name);
		System.out.println("Pays : " + country);
		System.out.println("Nombre d'habitants : " + nbInhabitants);
		System.out.println("---------------------------");

	}
*/
	
	// Nouvels attributs gérés par l'adm
	private String name;
	private String country;
	private int nbInhabitants;
	
	// Variable statique pour compter les instances
    private static int countInstance = 0;
	
	// Nouveau constructeur (demande d'approbation)
	public City(String name, String country, int nbInhabitants) {
		setName(name);
		setCountry(country);
		setNbInhabitants(nbInhabitants);
		countInstance++;
	}
	// Nouveau constructeur prenant deux paramètres
	public City(String name, int nbInhabitants) {
		setName(name);
		this.country = "unknown";
		setNbInhabitants(nbInhabitants);
		countInstance++;
	}
	
	// Méthode pour obtenir le nombre d'instances
	public static int getcountInstance() {
		return countInstance;
	}
	
	// Mise en place des accesseurs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNbInhabitants() {
		return nbInhabitants;
	}
	public void setNbInhabitants(int nbInhabitants) {
		if(nbInhabitants < 0) {
			System.out.println("Le nombre d'habitant ne peut être négatif (" + nbInhabitants + ").");
			return;
		}
		this.nbInhabitants = nbInhabitants;		
		
	}
	
	// Méthode pour réduire la population
	public void reducePopulation(int reduction) {
		if (reduction < 0) {
			System.out.println("La réduction ne doit pas être négative");
			return;
		}
		if (reduction > this.nbInhabitants) {
			System.out.println("Impossible de réduire de " + reduction + " habitants. La ville ne compte que " + this.nbInhabitants + " habitants ");
			return;
		}
		this.nbInhabitants -= reduction;
		System.out.println("Réduction possible, nombre d'habitants actuel : " + this.nbInhabitants);
	}
	
	// Méthode pour affichage (ancien)
	 public void displayInfo() {
	        System.out.println("Ville : " + name);
	        System.out.println("Pays : " + country);
	        System.out.println("Nombre d'habitants : " + nbInhabitants);
	        System.out.println("------------------------");
	 }
	 
	 // Nouvelle méthode
	 public void display() {
		 System.out.println("Ville de " + name + " en " + country + " ayant " + nbInhabitants + " habitants ");
	 }
	 
	 // Méthode toString
	 @Override
	 public String toString() {
		 return "ville de " + name + " en " + country +  " ayant " + nbInhabitants + " habitants ";
	 }
	           
	
}
