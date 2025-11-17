
import java.util.*;

public class TestPerson {
/*	
	// 1.8 Créer une classe TestPerson avec plusieurs instances

	public static void main(String[] args) {
		Person manu = new Person ("Macron", "Emmanuel", 43, "Elysee à Paris");
		Person poutine = new Person ("Poutine", "Vladmir", 68);
		Person biden = new Person ("Biden", "Joe");
		
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
	}
*/
/*
	// 1.9 Ajouter un attribut << Ville de Naissance >> objet de type City
	
	public static void main(String[] args) {
		Person manu = new Person ("Macron", "Emmanuel", 43, "Elysee à Paris", new City ("Amiens", "France"));
		Person poutine = new Person ("Poutine", "Vladmir", 68);
		Person biden = new Person ("Biden", "Joe");
		
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
	}
*/
	
	// 2.0 Afficher les différentes personnalités
	
	 public static void main(String[] args) {
	        // Création de la liste des personnalités
	        List<Person> personnalites = new ArrayList<>();

	        personnalites.add(new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris",
	                                   new City("Amiens", "France")));

	        personnalites.add(new Person("Sarkozy", "Nicolas", 66, "Paris",
	                                   new City("Paris", "France", 2666666)));

	        personnalites.add(new Person("Johnson", "Boris", 56, "Downing street à London",
	                                   new City("New York", "Etats-unis")));

	        personnalites.add(new Person("Depardieu", "Gerard", 72, "Moscou",
	                                   new City("Châteauroux", "France")));

	        personnalites.add(new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris",
	                                   new City("New York", "USA")));

	        personnalites.add(new Person("Lawrence", "Jennifer", 36, "Louisville aux USA",
	                                   new City("Indian Hills", "USA")));

	        // Affichage de toutes les personnalités
	        System.out.println("Liste des personnalités");
	        System.out.println("========================");
	        for (Person p : personnalites) {
	            System.out.println(p.getDisplayString());
	        }

	        // Filtrage : personnes nées en France ou habitant Paris
	        System.out.println("\n\nListe après notre filtre");
	        System.out.println("========================");
	        for (Person p : personnalites) {
	            if (p.isBornInFranceOrLivesInParis()) {
	                System.out.println(p.getDisplayString());
	            }
	        }

	       
	    }

}
