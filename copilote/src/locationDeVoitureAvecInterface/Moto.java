package locationDeVoitureAvecInterface;
// Classe Moto elle herite de Vehicule et implement l'interface Louable
public class Moto extends Vehicule implements Louable {
	private int cylindree ;	public int getCylindree() {		return cylindree;	}
//constructeur 
	public Moto(int id, String marque, String modele, int cylindree) {
		super(id, marque, modele);		this.cylindree = cylindree;	}
	// implementaion de la methode abstraite	 getDetails()
public String getDetails() {   return "Moto: " + getMarque() + " " + getModele() + " (" + cylindree + " cc)";}
//implementation de l'interface
public void Louer() { System.out.println("La moto '" + getMarque() + " " + getModele() + "' a été louée."); 	}
//redefinition de la methode toString
public String toString() { return getDetails();}	

}
