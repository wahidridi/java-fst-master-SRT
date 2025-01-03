package day2;

public class Etudiant {
	
	private int id ; private String nom;
	//getter()
	public   int    getId()       {return id;}
	public   void   setID(int id)  {this.id=id;}
	// setter() : pas de type de retour
	
	public String getNom() {return nom;}
	public void setNom(String nom) { this.nom=nom;}
	private double moy;
	
	// getters and setters moy
	
	public double getMoy()           {return moy;}
	public void   setMoy(double moy) {this.moy=moy;}
	// fonction mention
	public void mention()
	{
		if (moy < 10)
			System.out.print("redouble\n");
		if ((moy >=10) && (moy <12))
			System.out.print("Passable\n");
		if ((moy >=12) && (moy <14))
			System.out.print("Assez Bien\n");
		if ((moy >=14) && (moy <16))
			System.out.print("Bien\n");
		if ((moy >=16) && (moy <=20))
			System.out.print("Tres Bien\n");
	}
	
	// constructeur avec parametre il porte le meme nom que la classe est san type de retour
	public Etudiant (int id , String nom , double moy)
	{
		this.id = id;
		this.nom=nom;
		this.moy=moy;
	
	}
	
	// la creation d'un constructeur avec parametre genere un problem au niveau du travail precedent base sur le constructeur par defaut 
	// pour remedier a cela problem il faut juste declarer explicitement notre constructeur par defaut
	
	public Etudiant() {}
	

}
