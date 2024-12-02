package day_2;

public class main {

	public static void main(String[] args)
    {
		// 1 er methode 
		Etudiant e = new Etudiant();
		System.out.println("l'ancien id est "+e.getId()+
				           "et l'ancien nom est "+e.getNom());
		e.setId(2);e.setNom("ahmed");e.setMoyenne(17);
		System.out.println("le nouveau  id est "+e.getId()+
		           "et le nouveau  nom est "+e.getNom());
		// 2 eme methode 
		Etudiant e1 = new Etudiant(3,"elaa",13);
		e1.mention();
		e1.setMoyenne(12); e1.mention();

	}

}
