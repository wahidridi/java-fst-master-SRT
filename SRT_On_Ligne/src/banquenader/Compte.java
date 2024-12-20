package banquenader;

public abstract class Compte {
	protected String numero; protected double solde;


	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	public String getNumero() {		return numero;	}
	public void setNumero(String numero) {		this.numero = numero;	}


	public double getSolde() {		return solde;	}
	public void setSolde(double solde) {		this.solde = solde;	}
	public void deposer(double montant) {
		if(montant>0 ) solde =+montant;
	}
	public abstract void retirer(double montant);
	

}
