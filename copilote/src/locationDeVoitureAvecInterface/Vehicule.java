package locationDeVoitureAvecInterface;
// Classe abstraite Vehicule
public abstract class Vehicule {
	//attributs avec la notion de l'encapsulation : rendre les attributs accessible seulement par les methode get 1 set
private int id ; private String marque ; private String modele;
//encapsulation
public int    getId()     {	return id    ;}
public String getMarque() {	return marque;}
public String getModele() {	return modele;}
//constructeur sans type de retour ayant le meme nom que la classe
public Vehicule(int id, String marque, String modele) {
	this.id = id;	this.marque = marque;	this.modele = modele;}

 //Methode abstraite getDetails sans corps redefinit sur tous les heritiers 
public abstract String getDetails();

//redefinition de la methode toStriong
public String toString() {return "Vehicule{id=" + id + ", marque='" + marque + "', modele='" + modele + "'}";
}

}