package day_5;

public class Moto extends Vehicule{
	
	private int carteGrise;
	public int getCarteGrise() {return carteGrise;}
	public void setCarteGrise (int carteGrise) {this.carteGrise=carteGrise;}
	public Moto (String marque,String type,String matricule,int carteGrise) {
		super(marque,type,matricule);
		this.carteGrise=carteGrise;
	}

	@Override
	public double fraisLocation() {		return 50;	}

	@Override
	public void afficher() {
		System.out.println("marque: "+getMarque()+" type: "+getType()+" Matricule est :"+getMatricule()+" carte grise si 1 oui si 0 non : "+carteGrise);
		
	}

}
