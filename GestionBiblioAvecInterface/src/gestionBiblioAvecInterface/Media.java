package gestionBiblioAvecInterface;
// classe abstraite Media
public abstract class Media {
private int id ; private String titre ; private String auteur;
public Media (int id ,String titre , String auteur) {this.id=id;this.titre=titre;this.auteur=auteur;}
public int getId() {return id;} public void setID(int id){this.id=id;}
public String getTitre() {return titre;} public void setTitre(String titre){this.titre=titre;}
public String getAuteur() {return auteur;} public void setAuteur(String auteur){this.auteur=auteur;}
//methode abstraite
public abstract String getDetails();
// redefinition de la methode toString
public String toString() {return "Media { id = " +id+", titre ='"+titre+"',Auteur='"+auteur+"'}";}
}