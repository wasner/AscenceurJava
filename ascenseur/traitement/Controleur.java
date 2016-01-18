import java.util.*;

/**
 * Classe contenant toute la partie contr�le du projet
 */
public class Controleur {

	/**
	 * Constructeur par d�faut
	 * @param a liste des ascenseurs
	 */
    public Controleur(List<Ascenseur> a) {
    	this.ascenseurs=a;
    	//Constante.setNbAscenseur(nbAscenseur);
    	//Constante.setNbEtage(nbEtage);
    	this.requetes= new Vector<RequeteExterne>();
    }

    /**
     * liste contenant les ascenseurs
     */
    private List<Ascenseur> ascenseurs;

    /**
     * tableau contenant les requ�tes externes
     */
    private Vector<RequeteExterne> requetes;


	/**
	 * permet de cr�er des requ�te externe dans l'immeuble
	 * @param etage l'�tage d'ou vient la requ�te
	 * @param direction direction dans la qu'elle personne veux allez (monter ou descendre)
	 */
    public void creerRequeteExterne(Etage etage, String direction) {
        // TODO implement here
    	this.requetes.add(new RequeteExterne( direction, etage));
    }

	/**
	 * permet de choisir l'ascenseur de mani�re optimal pour satisfaire les requ�tes
	 */
    public void choisirAscenseur() {
    	//System.out.println(requetes.size());
    	for(RequeteExterne r : this.requetes){
    		//System.out.println(ascenseurs.size());
    		Ascenseur ascenceurChoisie=null;
    		for(Ascenseur a : this.ascenseurs){
    			//System.out.println(a.getEtat()+ " " + a.getEtageCourant().getNumEtage());
    			if(r.getDirection()==a.getEtat()){
    				for (Etage e : a.getEtages()){
    					//System.out.print(e.getNumEtage());
    					if (etagesEgaux(e, r.getEtage())){
    						if(r.getDirection()=="descendant" && etageUnPlusPetit(r.getEtage(),a.getEtageCourant())){
    							ascenceurChoisie=a;
    						}
    						else if (r.getDirection()=="montant" && etageUnPlusGrand(r.getEtage(),a.getEtageCourant())){
    							ascenceurChoisie=a;
    						}
    						break;
    					}
    				}
    				//System.out.println(" ");
    			}
    			else if (ascenceurChoisie==null && a.getEtat()=="immobileFerme"){
    				ascenceurChoisie=a;
    				//System.out.println("eeeeeeS");
    			}
    		}
    		if(ascenceurChoisie != null){
    			ascenceurChoisie.ajouterRequete(r);
    			this.requetes.remove(r);
    			//System.out.println(ascenceurChoisie);
    			break;
    		}
    	}
    }

	/**
	 * permet de s�l�ctionner l'ascenseur
	 * @param ascenseurs ascenseur s�lectionner
	 */
    public void setAscenseurs(List<Ascenseur> ascenseurs) {
		this.ascenseurs = ascenseurs;
	}

	/**
	 * V�rifie si deux �tages sont �gaux
	 * @param e1 premi�re �tage
	 * @param e2 deuxi�me �tage
	 * @return si les deux �tages sont �gaux true sinon false
	 */
	private boolean etagesEgaux(Etage e1, Etage e2){
		
    	return e1.compareEtage(e2)==0;
    	
    }

	/**
	 * permet de savoir si le premi�re �tage (e1) compar� est plus petit que le deuxi�me (e2)
	 * @param e1 premi�re �tage
	 * @param e2 deuxi�me �tage
	 * @return true si l'�gage 1 est plus petit que le 2
	 */
    private boolean etageUnPlusPetit(Etage e1, Etage e2){
    	return e1.compareEtage(e2)<0;
    }

	/**
	 * permet de savoir si le premi�re �tage (e1) compar� est plus grand que le deuxi�me (e2)
	 * @param e1 premi�re �tage
	 * @param e2 deuxi�me �tage
	 * @return true si l'�tage 1 est plus grand que le 2
	 */
    private boolean etageUnPlusGrand(Etage e1, Etage e2){
    	return e1.compareEtage(e2)>0;
    }

}
