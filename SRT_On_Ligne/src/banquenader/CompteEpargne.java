package banquenader;

public class CompteEpargne extends Compte{
	
	public CompteEpargne(String numero, double solde, double tauxInteret) {
		super(numero, solde);
		this.tauxInteret = tauxInteret;
	}

	private double tauxInteret;
	public void appliquerInteret() {
		solde =+ solde*tauxInteret/100;
	}

	@Override
	public void retirer(double montant) {
		
	if (montant >0 && montant <=solde ) {solde=-montant;}
	else System.out.println("solde insuffsant");
		
	}
	

}
