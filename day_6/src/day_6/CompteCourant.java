package day_6;

public class CompteCourant implements CompteBancaire {
	private String numCompte ;
	private double solde;
	private double rouge;
	public String getNumCompte() {return numCompte;	}
	public void setNumCompte(String numCompte) {this.numCompte = numCompte;	}
	public double getSolde() {return solde;	}
	public void setSolde(double solde) {this.solde = solde;	}
	public double getRouge() {return rouge;	}
	public void setRouge(double rouge) {this.rouge = rouge;	}
	

	public CompteCourant(String numCompte, double solde, double rouge) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.rouge = rouge;
	}
	public void afficher() {
		System.out.println("num compte est : "+numCompte);
		System.out.println("le solde est : "+solde);
		System.out.println("rouge autorise est : "+rouge);		
	}

	public void debiter(double montant) {
	if(solde +rouge > montant)
	{solde -=montant;
	System.out.println("le nouveau solde est : "+solde);
	}
		
	}

	public void crediter(double montant) {
	solde+=montant;
	System.out.println("le nouveau solde est : "+solde);		
	}

}
