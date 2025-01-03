package day_6;

public interface CompteBancaire {
	
	public void afficher();
	public abstract void debiter(double montant);
	public abstract void crediter(double montant);
//l'ecriture du mot abstract est optionnele 
//tous les methodes dans une interface sont implicitement abstract 	
}
 