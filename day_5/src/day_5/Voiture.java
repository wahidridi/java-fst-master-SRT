package day_5;

public class Voiture extends Vehicule {
	private int nbPlace ;
	public int getNbPlace() {return nbPlace;}
	public void setNbPlace(int nbPlace){this.nbPlace=nbPlace; } 
	public Voiture (String marque, String type , String matricule , int nbPlace) {
		super(marque , type , matricule);
		this.nbPlace=nbPlace;
	}
	@Override
	public double fraisLocation() { return 100;	}
	@Override
	public void afficher() {
		System.out.println("marque: "+getMarque()+" type: "+getType()+" Matricule est "+getMatricule()+" nb de place est : "+nbPlace);
		
	}

}
