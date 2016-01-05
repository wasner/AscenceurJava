package ascenseur.traitement;

import java.util.*;


/**
 *
 */
public class Ascenseur {

    public Ascenseur(int PoidM, int nbPersM,Etage etages[]) {
    	etat="immobileFermer";
    	poidMax=PoidM;
    	nbPersonneMax=nbPersM;
    	nbEtagesDeservis=etages.length; 	
    }
    
    private int nbEtagesDeservis;
    private int nbPersonneMax;
    private Etage etageCourant;
    
    public Etage getEtageCourant() {
		return etageCourant;
	}

	private int poidMax;
    private String etat;   					//immobileFerme, immobileOuvert, montant, descendant
    public String getEtat() {
		return etat;
	}

	private boolean bloquer=false;
    
    private Utilisateur utilisateurs[];
    private Etage etages[];					//liste des etages deservis. (exemple: 1,2,3,6,8,9)
    private Option options[];
    
    LinkedList<Requete> requetes=new LinkedList<Requete>();

    
    public void bloquer() {
    	bloquer=true;
    }

    public void debloquer() {
        bloquer=false;
    }

    public void ajouterRequete(Requete requete) {
        requetes.add(requete);
    }

    public void creerRequeteInterne(Etage etage) {
    	RequeteInterne requete = new RequeteInterne(etage);
        ajouterRequete(requete);
    }    
    
    public boolean testEtatSuivantImmoFerme(){
    	if((requetes.size()==0) || (((requetes.getFirst()).getRequeteEtage()).compareEtage(etageCourant))!=0){
			etat="immobileFerme";
			return true;
    	}
    	return false;
    }
    
    
    public boolean testEtatSuivantImmoOuvert(){
    	if((requetes.size()!=0) && (((requetes.getFirst()).getRequeteEtage()).compareEtage(etageCourant))==0){
    		etat="immobileOuvert";
    		for(int i=0;i<requetes.size();++i){
    			if((requetes.get(i).getRequeteEtage()).compareEtage(etageCourant)==0){
    				requetes.remove(i);
    			}
    		}
    		return true;
    	}
    	return false;
    }
    
    
    public boolean testEtatSuivantMontant(){
    	if((requetes.size()!=0) && (((requetes.getFirst()).getRequeteEtage()).compareEtage(etageCourant))==1){
    		etat="montant";
    		return true;
    	}
    	return false;
    }
    
    
    public boolean testEtatSuivantDescendant(){
    	if((requetes.size()!=0) && (((requetes.getFirst()).getRequeteEtage()).compareEtage(
    			etageCourant))==-1){
    		etat="descendant";
    		return true;
    	}
    	return false;
    }

	public String action() {
		if (bloquer==false){
	        if(testEtatSuivantImmoOuvert()){}
	        else if (testEtatSuivantImmoFerme()){}
	        else if(testEtatSuivantDescendant()){}
	        else if(testEtatSuivantMontant()){}
		}
        return etat;
    }

    public void triAppel() {
        //Fonction triant les appels en attente
        //remplissage d'un tableau avec les destinations des appels
        Iterator it=requetes.iterator();

        while(it.hasNext())//Parcours de la liste contenant les requ�tes
        {
            Object o = it.next();
            this.requetes.add(Requete.getRequeteEtage());
            if(RequeteExterne.getEtage() != this.getEtageCourant()) //Si l'�tage ou se trouve l'ascenceur n'est pas l'�tage ou il y a une requ�te
                this.requetes.add(RequeteExterne.getEtage());//On ajoute l'�tage ou il y a une requ�te dans la file d'attente
        }


        //Algorithme de tri du precedent tableau
        //Si on monte
        if(this.etat == "montant") {
            Collections.sort(this.requetes,null); //On trie les requ�tes dans l'ordre croissant (c'est � dire que les requ�tes provenant d'�tage les plus proches de l'ascenceur vont arriv� en premi�re)
        }
        else{ //Si on descend
            // create comparator for reverse order
            Comparator cmp = Collections.reverseOrder();
            Collections.sort(requetes,cmp); //On trie les requ�tes dans l'ordre d�croissant (cad que les requ�tes provenant des �tages les plus proches seront en premier)
        }

    }

}
