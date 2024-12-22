package GestionEcole;       //wahid dridi srt master 1
//Classe Ecole 
import java.util.ArrayList;             import java.util.List;
public class Ecole { 
	private List<Personne> listePersonnes; private List<Cours> listeCours;
//constructeur
	public Ecole() {
		this.listePersonnes = new ArrayList<>();
		this.listeCours = new ArrayList<>();	}
//Methode pour ajouter une personne
	public void ajouterPersonne(Personne personne) {listePersonnes.add(personne);}	
//Methode pour ajouter un cours
	public void ajouterCours(Cours cours) {listeCours.add(cours);}
//Methode pour afficher tous les personnes	
	public void afficherToutesLesPersonnes() {System.out.println("Liste des personnes");
	for(Personne p : listePersonnes) {p.afficherDetails();	}
	}
//Methode pour afficher tous les cours
	public void afficherToutesLesCours() {System.out.println("Liste des cours");
	for(Cours c : listeCours) {System.out.println("- "+c.getTitre());}
	}
}
