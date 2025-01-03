package locationDeVoitureAvecInterface;

public class Main {

	public static void main(String[] args) {
		Agence agence = new Agence();
		
		Voiture voiture1= new Voiture(1, "Toyota", "Corolla", 4);
		Voiture voiture2= new Voiture(2, "Toyota", "Corolla2", 4);
		Moto moto1 = new Moto(3, "Yamaha", "MT-07", 689);
		
		agence.ajouterVehicule(voiture1);
		agence.ajouterVehicule(voiture2);
		agence.ajouterVehicule(moto1);
		
		System.out.println("Affichage des véhicules disponibles dans l'agence  : ");
		
		agence.afficherTousLesVehicules();
		
		System.out.println("\n Locxation d'un vehicule  : "); 
		voiture1.Louer();
		moto1.Louer();

	}

}
