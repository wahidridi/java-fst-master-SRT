package gestionBiblioAvecInterface;

public class Main {

	public static void main(String[] args) {
		Bibliotheque bibliotheque = new Bibliotheque();
		Livre livre1 = new Livre(1," les Miserable "," Victor Hugo", 1232);
		Livre livre2 = new Livre(2," 1984 "," George Orwell", 358);
		Magazine magazine1 = new Magazine(3, "Science et Vie","Equipe S&V", 487);
		bibliotheque.ajouterMedia(livre1);
		bibliotheque.ajouterMedia(livre2);
		bibliotheque.ajouterMedia(magazine1);
		System.out.println("Affichage des media dans la bibliotheque : ");
		bibliotheque.afficherTousLesMedias();
		System.out.println("\nEmprunt d'un livre : ");
		livre1.emprunter();
	}

}
