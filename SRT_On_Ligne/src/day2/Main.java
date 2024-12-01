package day2;

public class Main {

	public static void main(String[] args) {
		
		// methode 1
		Etudiant e = new Etudiant(); // e est un constructeur sans parametre 
	
		System.out.println("l'ancien id est  : "+e.getId()+" et le l'ancien nom est : "+ e.getNom());
		e.setID(50);
		
		e.setNom("walid" );
		e.setMoy(15);
		System.out.println("le nouveau  id est  : "+e.getId()+" et le le nouveau nom est : "+ e.getNom()+"\n");
		e.mention();
		
		// methode 2
		Etudiant e1 = new Etudiant(5,"alaa",15);
		e1.mention();
		System.out.println("le nouveau  id est  :" +e1);
		e1.setMoy(17);
		e1.mention();
		
		
		
		
		
		
		
		
		
	}

}
