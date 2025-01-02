package gestionBiblioAvecInterface;
//classe Livre fille de Media et derive de l'interface Empruntable
 public class Livre extends Media implements Empruntable{
	private int nombrePages ; public int getNombrePages() {return nombrePages;}
	public Livre(int id ,String titre , String auteur, int nombrePages) {
		super(id ,titre,auteur);
		this.nombrePages=nombrePages;
		}
public String getDetails() {	return "Livre :"+getTitre()+"par"+getAuteur()+"("+nombrePages+"pages)"; }

// implementaion de l'interaface
public void emprunter() {System.out.println("le Livre '"+getTitre()+"' a été emprunté.");  }
public String toString() { return getDetails();}
	

}
