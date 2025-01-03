package locationDeVoitureAvecInterface;

import java.util.ArrayList;
import java.util.List;

//Classe Agence
public class Agence {
	private List<Vehicule> vehicules ;
	// constructeur
	public Agence() { this.vehicules = new ArrayList<>();}
	
	// methode pour insere les vehicules dans la liste Vehicules 
	public void ajouterVehicule(Vehicule vehicule ) {
		vehicules.add(vehicule);
	}
	public void afficherTousLesVehicules() {
		for(Vehicule vehicule : vehicules ) {
			System.out.println(vehicule);}
	}

}
