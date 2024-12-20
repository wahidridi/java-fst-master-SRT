package banquenader;

import java.util.ArrayList;

public class Client {
	private String nom ; 
	private ArrayList<Compte> comptes;
	public Client(String nom) {
		this.nom = nom;
		this.comptes = new ArrayList<>();
	}
	public void ajouterCompte(Compte compte) {
		comptes.add(compte);
	}
	public void afficherComptes() {
		System.out.println("Client : " + nom);
		for(Compte compte : comptes) {
			System.out.println("compte :"+compte.getNumero()+"solde : "+
		 compte.getSolde()+"EUR");
		}
	}

}
