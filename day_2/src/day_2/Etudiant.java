package day_2;

public class Etudiant
{
	//l'encapsulatioin c'est de rendre les attributs privées accessible seulement par des getters et setters 
	private int id ; private String nom ; private double moyenne ;
	public int getId() {return id;}
	public void setId(int d) {id = d;}
	public String getNom() {return nom ;}
	public void setNom (String name) {nom=name ;}
	public double getMoyenne() {return moyenne;}
	public void setMoyenne(double moy) {moyenne=moy;}
	public Etudiant() {};
	public Etudiant(int id, String nom,double moyenne)
	{this.id=id;
	this.nom=nom;
	this.moyenne = moyenne;
	}
	//fonction mention
	public void mention()
	{
		if(moyenne<10)System.out.println("redouble");
		if((moyenne>=10)&& (moyenne<12))System.out.println("passable");
		if((moyenne>=12)&& (moyenne<14))System.out.println("assez bien ");
		if((moyenne>=14)&& (moyenne<16))System.out.println("bien");
		if((moyenne>=16)&& (moyenne<=20))System.out.println("tres bien");
		
	}

}
