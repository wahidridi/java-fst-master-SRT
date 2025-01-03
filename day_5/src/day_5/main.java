package day_5;

public class main {

	public static void main(String[] args) {
		Vehicule v1 = new Voiture("kia","rio","1tu1",5);
		Vehicule v2 = new Voiture("ford","ka","2tu2",5);
		Vehicule v3 = new Voiture("fiat","uno","3tu3",5);
		Vehicule m1 = new Moto("Honda","ninja","M4",1);
		Vehicule c1 = new Camion("OM","40","5tu5",2);
		AgenceVoiture agence = new AgenceVoiture();
		agence.ajouter(v1);
		agence.ajouter(v2);
		agence.ajouter(v3);
		agence.ajouter(c1);
		agence.ajouter(m1);
		agence.afficher();
		

	}

}
