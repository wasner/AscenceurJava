import java.util.*;

public interface Requete
{
	/**
	 * m�thode abstraite qui permet de retourner l'�tage de la requ�te
	 * @return variable selon requ�te interne(num�ros de l'�tage de destination) ou externe ( etage d'ou provient l'appel)
	 */
	public Etage getEtage();
}
