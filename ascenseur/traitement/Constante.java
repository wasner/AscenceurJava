/**
 * Classe contenant toutes les constantes relatifs au projet dans sa globalit�
 */
public abstract class Constante {

    private static final int nbAscenceurMax = 10;
    private static final int nbEtage = 20;

    /**
     * permet de savoir le nombre d'�tage dans l'immeuble
     * @return nbEtage (int)
     */
    public static final int getNbEtage() {
        return nbEtage;
    }

    /**
     * permet de savoir le nombre d'ascenseur qui compose l'immeuble
     * @return nbAScenseurMax (int)
     */
    public static final int getNbAscenceur() {
        return nbAscenceurMax;
    }

    /**
     * permet de retourner le num�ro de l'�tage minimum
     * @return int
     */
	public static int getNumEtageMin() {
		// TODO Auto-generated method stub
		return 0;
	}
}
