package day_6;

public class Banque {

	public static void main(String[] args) {
		Client client = new Client("Wahid Dridi");
		System.out.println("*********************************");
		CompteCourant c1= new CompteCourant("1",200,100);
		CompteCourant c2= new CompteCourant("2",300,150);
		CompteEpargne ce1= new CompteEpargne("3",400,6);
		client.ajouterCompte(c1);
		client.ajouterCompte(c2);
		client.ajouterCompte(c1);
		client.afficherCompte();
		c1.crediter(40);
		c2.debiter(350);
		ce1.crediter(120);
		client.afficherCompte();
		
		c1.crediter(1000);
		client.afficherCompte();
	}

}
