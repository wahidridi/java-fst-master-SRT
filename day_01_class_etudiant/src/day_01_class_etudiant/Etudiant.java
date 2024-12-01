package day_01_class_etudiant;

public class Etudiant {
	int id ;
	String nom ;
	String ad;
	public void aff()
	{
		System.out.println("hello ");
	}
	// public Etudiant() {	}  c'est un constructeur par defaut vide sans parametre 
	// et sans type de retour il existe implicitement
	 
	public Etudiant(int id , String nom ,String ad) { // constructeur avec parametre
		this.id=id;
		this.nom=nom;
		this.ad=ad;
	}  
	

}
