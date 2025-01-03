package day_5;

public abstract class Vehicule {
	private String marque; 
	public String getMarque() {return marque;}
	public void setMarque(String marque) {this.marque=marque;}
	private String type;
	public String getType() {return type;}
	public void setType(String type ) {this.type=type;}
	private String matricule ;
	public String getMatricule() {return matricule;}
	public void setMatricule(String matricule) {this.matricule=matricule;}
	public Vehicule(String marque, String type,String matricule )
	      {this.marque=marque;
	       this.type=type;
	       this.matricule=matricule;
	      }
// methode abstraite  qui retourne le frais de location 
	public abstract double fraisLocation();
	
//methode abstraite qui affiche les parametres de chaque classe fille à part
	public abstract void afficher();
	
}
