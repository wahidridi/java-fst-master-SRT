package banquenader;

public class CompteBancaire extends Compte {

	public CompteBancaire(String numero, double solde) {
		super(numero, solde);		
	}

	@Override
	public void retirer(double montant) {
	if(montant >0 && montant <=solde)
	{solde =-montant;}else System.out.println("solde insuffisant");
		
	}
	

}
