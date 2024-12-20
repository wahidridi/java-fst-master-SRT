package banquenader;

public class Banque {

	public static void main(String[] args) {
		Client client1 = new Client("Alice");
		Client client2 = new Client("Bob");
		Compte compte1 = new CompteBancaire("CB001",1000.0);
		Compte compte2 = new CompteEpargne("CE002",2000.0,2.5);
		client1.ajouterCompte(compte1);
		client1.ajouterCompte(compte2);
		Compte compte3 = new CompteBancaire("CB002",1500.0);
		client2.ajouterCompte(compte3);
		client1.afficherComptes();
		client2.afficherComptes();
		compte1.deposer(500);
		compte2.retirer(300);
		((CompteEpargne)compte2).appliquerInteret();
		System.out.println("\n Apres les operations ");
		client1.afficherComptes();
		

	}

}
