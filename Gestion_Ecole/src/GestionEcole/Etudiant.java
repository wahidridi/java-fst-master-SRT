package GestionEcole;   //wahid dridi srt master 1

import java.util.List;

//Classe Etudiant
public class Etudiant extends Personne {
	private String classe ; private List<Double> notes ;
//Getters and Setters 
	public String getClasse() {	return classe;	}
	public void setClasse(String classe) {	this.classe = classe;	}	
//Construsteur 
	public Etudiant(int id, String nom, String prenom, int age, String classe, List<Double> notes) {
		super(id, nom, prenom, age);	this.classe = classe;	this.notes = notes;	}

//Methode pour attribuer une note
	public void attrubuerNote(double note) {notes.add(note);}
//Methode pour calculer la moyenne 
	public double obtenirMoyenne() {if(notes.isEmpty())return 0.0; 
	double somme=0.0;
	for (double note:notes) {somme+=note;} return (somme/notes.size());
	}
//Implementation de afficherDetails
	public void afficherDetails() {System.out.println("Etudiant :"+getNom()+" "+getPrenom()+
			" Age : "+getAge()+" classe"+getClasse()+" Moyenne : "+obtenirMoyenne());}
}
