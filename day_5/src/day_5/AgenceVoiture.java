package day_5;

import java.util.ArrayList;
import java.util.List;

public class AgenceVoiture {
	private List<Vehicule> vehicules = new ArrayList<>();
	//fonction qui ajoute les vehicules de l'agence dans une liste
	public void ajouter(Vehicule v) {
		vehicules.add(v);
	}
	//fonction qui fait l'affichage 
	public void afficher () {
		// for each
		for(Vehicule v : vehicules) {
			v.afficher(); // methode abstraite dans la classe mere vehicule
			System.out.println("le frais de location est : "+ v.fraisLocation());// methode abstraite dans la classe mere vehicule
		}
	}
}
