package day_6;

public class CompteEpargne implements CompteBancaire{
	private String numCompte ;
	private double solde;
	private double tauInteret;
	public String getNumCompte() {return numCompte;	}
	public void setNumCompte(String numCompte) {this.numCompte = numCompte;	}
	public double getSolde() {return solde;	}
	public void setSolde(double solde) {this.solde = solde;	}
	public double getTauInteret() {return tauInteret;	}
	public void setTauInteret(double tauInteret) {this.tauInteret = tauInteret;	}

	public CompteEpargne(String numCompte, double solde, double tauInteret) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.tauInteret = tauInteret;
	}
	@Override
	public void afficher() {
		System.out.println("num compte est : "+numCompte);
		System.out.println("le solde est : "+solde);
		System.out.println("le taux d'interet est : "+tauInteret);			
		
	}

	@Override
	public void debiter(double montant) {
		if(solde > montant)
		{solde -=montant;
		System.out.println("le nouveau solde est : "+solde);
		}
	}

	@Override
	public void crediter(double montant) {
		solde+=montant;
		System.out.println("le nouveau solde est : "+solde);		
	}
	public void CalculInteret() {
		double interet = solde *tauInteret/100;
		System.out.println("l'interet est : "+interet);
	}

}
