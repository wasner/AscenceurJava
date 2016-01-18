import java.util.*;

/**
 * 
 */
public class RequeteExterne implements Requete {
    /**
     * Direction dans la qu'elle la personne veux allez (monter ou descendre)
     */
    private String direction;
    /** Etage de l'appel */
    private Etage etage;

    /**
     * Constructeur par d�faut de la requ�te externe
     * @param direction si la personne veux monter ou descendre
     * @param etage l'�tage d'o� provient l'appel de la requ�te
     */
    public RequeteExterne(String direction, Etage etage) {
        this.direction = direction;
        this.etage = etage;
    }

    /**
     * Retourne l'etage de l'appel
     *
     * @return       Etage de l'appel
     */
    public Etage getEtage()
    {
        return etage;
    }

    /**
     * Constructeur
     *
     * @param etage          Etage de l'appel
     */
    public void RequeteDescendre(Etage etage)
    {
        etage = etage;
    }

    /**
     * permet de faire une requ�te pour monter
     * @param etage
     */
    public void RequeteMonter(Etage etage) { etage = etage;}

    /**
     * permet de savoir dans qu'elle direction la personne veux allez
     * @return
     */
    public String getDirection() {
        return direction;
    }

    /**
     * permet de d�finir la direction de la requ�te
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }



}

