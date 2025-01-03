package day_5;

public class Camion extends Vehicule{
	private double capacite;
	public double getCapacite() {return capacite;}
	public void setCapacite(double capacite ) {this.capacite=capacite;}
	public Camion (String marque , String type, String matricule , double capacite) {
		super(marque,type,matricule);
		this.capacite=capacite;
	}

	@Override
	public double fraisLocation() {
		return 150;
	}

	@Override
	public void afficher() {
		System.out.println("marque: "+getMarque()+" type: "+getType()+" Matricule est: "+getMatricule()+" nb de place est : "+capacite);
		
	}

}
