import java.util.*;

/**
 * 
 */
public abstract class Requete
{
	public static int deplacement; //Variable qui contient l'�tat actuelle de l'ascenceur (en d�placement vers le haut, bas, arr�ter, etc)
	public static int monter; //L'ascenceur � re�u une requ�te pour monter
	public static int descendre; //L'ascenceur � re�u une requpete pour descendre
	public static int arret; //L'ascenceur � re�u une requ�te d'arr�t
	public static int annuler; //La derni�re commande envoy� � �t� annuler /!\ BONUS

	public Requete() {
	}
}