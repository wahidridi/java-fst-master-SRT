package gestionBiblioAvecInterface;

public class Magazine extends Media{
	private int numero; public int getNumero() {return numero;}
	public Magazine(int id ,String titre , String auteur, int numero) {
		super(id, titre, auteur);		this.numero=numero;	}
	public String getDetails() {	return "Magazine :"+getTitre()+"par"+getAuteur()+"(Numero "+numero+")"; }
	
public String toString() {return getDetails()	;}
}

