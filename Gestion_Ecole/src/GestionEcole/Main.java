package GestionEcole;   //wahid dridi srt master 1
//Methode Principale
public class Main {

	public static void main(String[] args) {
		Ecole ecole = new Ecole();
// Création de personnes
        Professeur prof1 = new Professeur(1, "Smith", "John", 45, "Mathématiques", 4000);
        Professeur prof2 = new Professeur(2, "Doe", "Jane", 38, "Physique", 3800);
        Etudiant etu1 = new Etudiant(3, "Brown", "Alice", 20, "2A Informatique");
        Etudiant etu2 = new Etudiant(4, "White", "Bob", 22, "3A Informatique");
        Administrateur admin = new Administrateur(5, "Green", "Charlie", 50, "Directeur", 40);
// Ajout de personnes à l'école
        ecole.ajouterPersonne(prof1);
        ecole.ajouterPersonne(prof2);
        ecole.ajouterPersonne(etu1);
        ecole.ajouterPersonne(etu2);
        ecole.ajouterPersonne(admin);
// Création de cours
        Cours cours1 = new Cours(101, "Algorithmes", prof1);
        Cours cours2 = new Cours(102, "Mécanique", prof2);
// Ajout de cours à l'école
        ecole.ajouterCours(cours1);
        ecole.ajouterCours(cours2);
// Inscription des étudiants dans les cours
        cours1.inscrireEtudiant(etu1);
        cours1.inscrireEtudiant(etu2);
        cours2.inscrireEtudiant(etu2);
// Attribution de notes
        cours1.attribuerNotePourEtudiant(etu1, 15);
        cours1.attribuerNotePourEtudiant(etu2, 17);
        cours2.attribuerNotePourEtudiant(etu2, 18);
// Afficher toutes les personnes et tous les cours
        ecole.afficherToutesLesPersonnes();
        ecole.afficherTousLesCours();
// Afficher les participants aux cours
        cours1.afficherParticipants();
        cours2.afficherParticipants();
	}

}
