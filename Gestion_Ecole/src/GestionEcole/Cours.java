package GestionEcole;  //wahid dridi srt master 1
import java.util.ArrayList;             import java.util.List;
//Classe Cours
public class Cours { 	
	private int id ; private String titre ;
	private Professeur professeur;
	private List<Etudiant> etudiantInscrits;
// Getters and Setters
	public int getId()                               {		return id;	}
	public void setId(int id)                        {		this.id = id;	}
	public String getTitre()                         {		return titre;	}
	public void setTitre(String titre)               {		this.titre = titre;	}
	public Professeur getProfesseur()                {		return professeur;	}
	public void setProfesseur(Professeur professeur) {	this.professeur = professeur;	}		
//Constructeur
	public Cours(int id, String titre, Professeur professeur) {
		this.id = id;	this.titre = titre;	this.professeur = professeur;
		this.etudiantInscrits = new ArrayList<>();	}
//Methode pour inscrire un etudiant
	public void afficherParticipants() {System.out.println("Participants du cours " +titre+":");
	for(Etudiant e : etudiantInscrits) {System.out.println("-"+e.getPrenom()+" "+e.getNom());}}
//Methode pour attribuer une note à un étudiant
	public void attribuerNotePourEtudiant(Etudiant etudiant, double note) {
		if (etudiantInscrits.contains(etudiant)) {
			etudiant.attrubuerNote(note);
		}else {System.out.println("Etudiant non inscrit dans ce cours");}
	}
}
