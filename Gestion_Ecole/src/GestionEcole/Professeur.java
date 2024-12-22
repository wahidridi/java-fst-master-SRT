package GestionEcole;  //wahid dridi srt master 1
import java.util.List;
import java.util.ArrayList;
//Class Professeur
public class Professeur extends Personne {
	private String matiere ; private double salaire ;	private List<Cours> coursAttribues;
//Getters and Setters 	
	public String getMatiere() 									{return matiere;	}
	public void setMatiere(String matiere) 						{this.matiere = matiere;	}
	public double getSalaire() 									{return salaire;	}
	public void setSalaire(double salaire) 						{this.salaire = salaire;	}
	//public List<Cours> getCoursAttribues() 					{return coursAttribues;	}
	//public void setCoursAttribues(List<Cours> coursAttribues) {this.coursAttribues = coursAttribues;	}

//Constructeur
	public Professeur(int id, String nom, String prenom, int age, String matiere, double salaire,
			List<Cours> coursAttribues) {
		super(id, nom, prenom, age);
		this.matiere = matiere;		this.salaire = salaire;		this.coursAttribues = new ArrayList<>();	}
	
//Methode pour attribuer un cours
	public void attribuerCours(Cours cours) {coursAttribues.add(cours);}
	
//Implementation de afficherDetails
	public void afficherDetails() {
		System.out.println("Professeur "+getPrenom()+" "+getNom()+" , age "+getAge()+"Matiere "+getMatiere()+", Salair "+getSalaire());
	}
	
}
