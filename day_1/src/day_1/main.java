package day_1;

public class main
{

	public static void main(String[] args) 
	{
     Etudiant e = new Etudiant(1,"wahid","tunis") ;
     Etudiant e1 = new Etudiant(2,"ali","ariana") ;
     e.afficher();
     System.out.println(e.id);
     System.out.println(e.nom);
     System.out.println(e.adresse);
     System.out.println(e1.id);
     System.out.println(e1.nom);
     System.out.println(e1.adresse);
     System.out.println("le id est: "+e.id+" le nom est: "
    		   +e.nom+" et l'adresse est : " +e.adresse);
     System.out.println("le id est: "+e1.id+" le nom est: "
  		   +e1.nom+" et l'adresse est : " +e1.adresse);
	}
}
