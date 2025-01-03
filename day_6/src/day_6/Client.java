package day_6;

import java.util.ArrayList;
import java.util.List;

public class Client {
private String nom ;
public String getNom() {return nom;}
public void setNom (String nom) {this.nom =nom;}
public Client(String nom) {this.nom=nom;}
private List<CompteBancaire> comptes = new ArrayList<>();
public void ajouterCompte(CompteBancaire c) {
	comptes.add(c);}
public void afficherCompte() {
	for (CompteBancaire c : comptes)
	{c.afficher();}
}

}
