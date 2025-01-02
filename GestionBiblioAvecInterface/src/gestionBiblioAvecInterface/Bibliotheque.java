package gestionBiblioAvecInterface;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
private List<Media> medias ;
public Bibliotheque() {this.medias = new ArrayList<>();}
public void  ajouterMedia(Media media){	medias.add(media); }
public void afficherTousLesMedias() 
  {for (Media media : medias) 
   {System.out.println(media);}
  }
}
