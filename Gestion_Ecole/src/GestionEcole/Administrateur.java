package GestionEcole;    //wahid dridi srt master 1
//Classe Administrateur
public class Administrateur  extends Personne{
	private String poste ; private int heuresTravaillees;
//Getters and Setters 
	public String getPoste() 								{	return poste;	}
	public void setPoste(String poste) 						{	this.poste = poste;	}
	public int getHeuresTravaillees() 						{ 	return heuresTravaillees;	}
	public void setHeuresTravaillees(int heuresTravaillees) {this.heuresTravaillees = heuresTravaillees;	}
//Constructeur 
	public Administrateur(int id, String nom, String prenom, int age, String poste, int heuresTravaillees) {
		super(id, nom, prenom, age);		this.poste = poste;
		this.heuresTravaillees = heuresTravaillees;       	}
//Methode pour generer un rapport 
	public void genererRapport() {System.out.println("Rapport "+poste+":"+getPrenom()+" "+getNom());}
	//Implementation de afficherDetails
	public void afficherDetails() {System.out.println("Administrateur:"+getNom()+" "+getPrenom()+
			" Age : "+getAge()+" ,Poste "+poste+" Heures Supplementaires : "+heuresTravaillees);}

}
