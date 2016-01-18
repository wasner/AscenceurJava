/**
 * Classe concernant les �tages
 */
public class Etage {
	/**
	 * Variable qui contient le num�ro de l'�tage
	 */
	private Integer numEtage;

	/**
	 * constructeur d'�tage
	 * @param numE
	 */
    public Etage(int numE) {
    	numEtage=numE;
    }

	/**
	 * permet de renvoy� le num�ro de l'�tage
	 * @return (int) numEtage
	 */
    public Integer getNumEtage() {
		return numEtage;
	}

	/**
	 * comparateur d'�tage
	 * @param etageCourant
	 * @return (int)
	 */
	public int compareEtage(Etage etageCourant) {
    	return numEtage.compareTo(etageCourant.getNumEtage());
    }

	/**
	 * permet de fixer le num�ro d'�tage
	 * @param i
	 */
	public void setNumEtage(int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * permet d'afficher proprement le num�ro de l'�tage
	 * @return
	 */
	public String toString(){
		return Integer.toString(numEtage);
	}
}
