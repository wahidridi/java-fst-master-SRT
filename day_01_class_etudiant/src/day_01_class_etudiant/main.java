package day_01_class_etudiant;

public class main {

	public static void main(String[] args) 
	{
		// il faut reserver une case memoire par l'instantiation 
		Etudiant e = new Etudiant(1,"ahmed","Tunis");
		//creation de l'objet e de type l'objet Etudiant
		//new c'est un constructeur
		System.out.println(e.id);
		System.out.println(e.nom);
		System.out.println(e.ad);
		e.aff();
		

	}

}
