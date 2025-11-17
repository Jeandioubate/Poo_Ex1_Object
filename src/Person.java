

public class Person {

	// Les attributs	
		public String lastName;
		public String firstName;
		public int age;
		public String address;
		public City bornCity;
		
	// Le constructeur
		public Person(String lastName, String firstName, int age, String address, City bornCity) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.age = age;
			this.address = address;
			this.bornCity = bornCity;
		}
		
	// Nouveau constructeur qui prend en paramètre 3 attributs
		public Person(String lastName, String firstName, int age) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.age = age;
			this.address = "unknown";
			this.bornCity = null;
		}
	
	// Nouveau constructeur qui prend en paramètres 2 attributs
		public Person(String lastName, String firstName) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.age = 0;
			this.address = "unknown";
			this.bornCity = null;
		}
/*	
	// Méthode toString() 1.8
		@Override
		public String toString() {
			return "Person[lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address=" + address + "]";
		}
*/
/*
	// Méthode modifiée pour inclure la ville de naissance 1.9
		@Override
		public String toString() {
			String personInfo = "Person[lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address=" + address + "]";
			
			String bornCityInfo;
			if (bornCity != null) {
				bornCityInfo = "BornCity " + bornCity.toString();
			} else {
				bornCityInfo = "Bornnull";
			}
			
			return personInfo + bornCityInfo;
		}
*/
	
	// Exo 2.0 Méthode pour afficher avec le format demandé
		 public String getDisplayString() {
		        String result = lastName + " , " + firstName + " , " + age + "ans , habitant " + address;

		        if (bornCity != null) {
		            result += " , Ville de naissance : " + bornCity.getDisplayString();
		        }

		        return result;
		    }

		    // Méthode pour vérifier si la personne est née en France ou habite Paris
		    public boolean isBornInFranceOrLivesInParis() {
		        // Vérifier si née en France
		        boolean bornInFrance = (bornCity != null && bornCity.isFrenchCity());

		        // Vérifier si habite Paris (en cherchant "Paris" dans l'adresse)
		        boolean livesInParis = address != null && address.toLowerCase().contains("paris");

		        return bornInFrance || livesInParis;
		    }

		    @Override
		    public String toString() {
		        return getDisplayString();
		    }
}
