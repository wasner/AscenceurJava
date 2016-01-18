import java.util.*;

public class RequeteInterne implements Requete {
	/**
	 * l'�tage de destination de la requ�te
	 */
    private Etage etageDestination;

	/**
	 * constructeur de requ�te interne
	 * @param etage �tage de destination de la personne
	 */
    public RequeteInterne(Etage etage) {
    	etageDestination=etage;
    }
    
	@Override
	/**
	 * permet de connaitre l'�tage de destination de la personne
	 */
	public Etage getEtage() {
		// TODO Auto-generated method stub
		return etageDestination;
	}
}
