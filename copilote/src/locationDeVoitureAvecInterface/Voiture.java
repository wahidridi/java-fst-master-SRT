package locationDeVoitureAvecInterface;

public  class Voiture extends Vehicule  implements Louable {
	
	private int nombrePortes;
	public int getNombrePortes() {return nombrePortes;	}
	
	// constructeur
    public Voiture(int id, String marque, String modele, int nombrePortes) 
    {
    	super( id, marque,modele) ; 
    	this.nombrePortes=nombrePortes;
    }
    
    // implementaion de la methode abstraite getDetails()
    public String getDetails()
    {  
    	return "Voiture: " + getMarque() + " " + getModele() + " (" + nombrePortes + " portes)";  
    }
    
    // implementation de l'interface
    public void Louer() 
    {
    	System.out.println("La voiture '" + getMarque() + " " + getModele() + "' a été louée.");
    }
    
    //redefinition de la methode toString
        public String toString()
    {return getDetails(); }
}
