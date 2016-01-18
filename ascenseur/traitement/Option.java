import java.util.*;

import affichage.VueAscenseur;

/**
 * 
 */
public abstract class Option implements Ascenseur  {
	/**
	 * Delegue d'ascenseur
	 */
	protected Ascenseur delegue;

	/**
	 * Constructeur d'option avec en param�tre le d�l�gu� d'ascenseur
	 * @param delegeu c'est le d�l�gu� de l'ascenseur
	 */
	public Option(Ascenseur delegeu) {
		// TODO Auto-generated constructor stub
		this.delegue= delegeu;
	}	
	@Override
	/**
	 * nom de l'action
	 */
	public String action() {
		// TODO Auto-generated method stub
		return delegue.action();
	}

	/**
	 * permet de bloquer l'ascenseur
	 */
	@Override
	public void bloquer() {
		// TODO Auto-generated method stub
		delegue.bloquer();
	}
	@Override
	/**
	 * permet de cr�er une requ�te interne � l'ascenseur
	 */
	public void creerRequeteInterne(Etage etage) {
		// TODO Auto-generated method stub
		delegue.creerRequeteInterne(etage);
	}

	/**
	 * permet de d�finir l'�tage courant de l'ascenseur
	 * @param etageCourant c'est l'�tage ou se trouve l'ascenseur
	 */
	@Override
	public void setEtageCourant(Etage etageCourant) {
		// TODO Auto-generated method stub
		delegue.setEtageCourant(etageCourant);
	}

	/**
	 * permet de connaitre l'�tage courant de l'ascenseur
	 * @return l'�tage courant de l'ascenseur
	 */
	@Override
	public Etage getEtageCourant() {
		// TODO Auto-generated method stub
		return delegue.getEtageCourant();
	}

	/**
	 * permet de connaitre l'�tat de l'ascenseur
	 * @return l'�tat de l'ascenseur
	 */
	@Override
	public String getEtat() {
		// TODO Auto-generated method stub
		return delegue.getEtat();
	}

	/**
	 * permet de d�bloquer l'ascenseur
	 */
	@Override
	public void debloquer() {
		// TODO Auto-generated method stub
		delegue.debloquer();
	}

	/**
	 * permet d'avoir la liste des �tages
	 * @return Etage
	 */
	@Override
	public List<Etage> getEtages() {
		// TODO Auto-generated method stub
		return delegue.getEtages();
	}

	/**
	 * permet de d�finir la liste des �tages
	 * @param etages la liste d'�tages
	 */
	@Override
	public void setEtages(List<Etage> etages) {
		// TODO Auto-generated method stub
		delegue.setEtages(etages);
	}

	/**
	 * permet de d�finir le nombre de personne max dans l'ascenseur
	 * @param personneMax le nombres de personnes max
	 */
	@Override
	public void setPersonneMax(int personneMax) {
		// TODO Auto-generated method stub
		delegue.setPersonneMax(personneMax);
	}

	/**
	 * permet de d�finir le poids que peut accueillir l'ascenseur
	 * @param poidMax le poids max
	 */
	@Override
	public void setPoidMax(int poidMax) {
		// TODO Auto-generated method stub
		delegue.setPoidMax(poidMax);
	}
	@Override
	/**
	 * permet de connaitre le poids max pour un ascenseur
	 */
	public int getPoidMax() {
		// TODO Auto-generated method stub
		return delegue.getPoidMax();
	}

	/**
	 * permet de retourner le nombre de personnes max dans l'ascenseur
	 * @return Nombres de personnes max
	 */
	@Override
	public int getPersonneMax() {
		// TODO Auto-generated method stub
		return delegue.getPersonneMax();
	}

	/**
	 * Permet de trie la liste des requ�tes de l'ascenseur
	 */
	@Override
	public void triAppel() {
		// TODO Auto-generated method stub
		delegue.triAppel();
	}

	/**
	 * permet d'ajouter des vue pour l'ascenseur(affichage)
	 * @param v vue pour l'ascenseur
	 */
	public void addVue(VueAscenseur v) {
		delegue.addVue(v);
		
	}

	/**
	 * permet de savoir si l'ascenseur est bloqu�
	 * @return true si bloqu�, false sinon
	 */
	@Override
	public boolean isBloquer() {
		// TODO Auto-generated method stub
		return delegue.isBloquer();
	}

	/**
	 * permet de faire monter l'ascenseur d'un �tage
	 */
	@Override
	public void monter() {
		// TODO Auto-generated method stub
		delegue.monter();
	}
	@Override
	/**
	 * permet de faire descendre l'ascenseur d'un �tage
	 */
	public void descendre() {
		// TODO Auto-generated method stub
		delegue.descendre();
	}

	/**
	 * permet d'ajouter une requ�te pour un ascenseur
	 * @param requete requ�te pour un ascenseur
	 */
	@Override
	public void ajouterRequete(Requete requete) {
		// TODO Auto-generated method stub
		
	}
}
