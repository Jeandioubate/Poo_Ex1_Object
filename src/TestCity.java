
public class TestCity {
/*	//1.1
	// Création des instances
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		City conakry  = new City("Conakry", "Guinée", 250000);
		City paris    = new City("Paris", "France", 650000);
		City newYork  = new City("New York", "Etats-Unis", 800000);	
		
	// J'affiche les différentes villes
		
		System.out.println("*******Liste des villes*******");	
		System.out.println("------------------------------");
		
		toulouse.displayInfo();
		conakry.displayInfo();
		paris.displayInfo();
		newYork.displayInfo();
		
	// Changement du nombre d'habitants de la ville de Toulouse	
		System.out.println("Nombre d'habitants après ajout");
		System.out.println("------------------------------");
		toulouse.nbInhabitants = toulouse.nbInhabitants + 20000;
		toulouse.displayInfo();			

	}
*/
/*	//1.2
	// Nouvelles instances
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 470000);
		City madrid = new City("Madrid", "Espagne", 350000);
		
	// J'affiche à nouveau les villes via les accesseur	
		System.out.println("\n--- Affichage via les accesseurs ---");
		System.out.println(" Ville : " + toulouse.getName() + ", Pays : " + toulouse.getCountry() + ", Habitants : " + toulouse.getNbInhabitants());
		System.out.println(" Ville : " + madrid.getName() + ", Pays : " + madrid.getCountry() + ", Habitants : " + madrid.getNbInhabitants());
		
	// Je fais le test avec une valeur négative 
		System.out.println("\n--- Test avec une valeur négative ---");
		toulouse.setNbInhabitants(-200);
		System.out.println("Nombre d'habitants actuel : " + toulouse.getNbInhabitants());
		
	// Je fais le test avec une valeur valide	
		System.out.println("\n--- Test avec une valeur valide ---");
		toulouse.setNbInhabitants(480000);
		System.out.println("Nombre d'habitants actuel après changement : " + toulouse.getNbInhabitants());
		
	// Je procède à la réduction de la population	
		System.out.println("\n--- Réduire Toulouse de 470000 à 370000 habitants ---");
		toulouse.reducePopulation(100000);
		System.out.println("Population après réduction : " + toulouse.getNbInhabitants());		
		
	}
*/
/*	//1.3
	// Test avec le nouveau constructeur prenant deux paramètres
	public static void main(String[] args) {
		City rabat = new City("Rabat", 577000);
		System.out.println("--- Affichage après création avec 2 paramètres ---");
		rabat.displayInfo();
		
	// Nouvel affichage avec modification de "unknown" via les accesseurs
		System.out.println("Avant modification : " + rabat.getCountry());
		rabat.setCountry("Maroc");
		System.out.println("Après modification : " + rabat.getCountry());
		System.out.println("---- Affichage final ----");
		rabat.displayInfo();
	}
*/
	//1.4
	//Création d'une nouvelle méthode
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		System.out.println("--- Affichage des nouvels attributs de toulouse ---");
		toulouse.display();	
	//1.5
	//	System.out.println(toulouse); // Le programme affiche un code. Parce qu'on a pas définie au préalable la méthode "toString()"
		
	//1.6	
	// Affichage avec la méthode "toString()"
		System.out.println("---- Affichage avec la méthode toString() ----");
		System.out.println(toulouse);
	}
	
	
		

}
