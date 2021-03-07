package dz.abdo.program;//the package containn

import java.util.ArrayList;

public class personne /* créeation d'une classe public personne */ 
{
    /* on peut utliser les attributs comme public par ce qu'il  ya + dans la classe
    mais on a utilisant protected car il ya un héritage donc les attributs de la classe pere " personne " sont protected*/
    
	protected String nom,prenom; 
	protected int age;

}
class Etudiant extends personne{} 
/* creation d'une classe fils " etudiant" depuis la classe pere "personne" /héritage/ */ 
class Enseignant extends personne{ 
    /* création d'une classe fils "Enseignant " depuis la classe pere "personne" /héritage/ */ 

	ArrayList<Etablissement>listetablissement=new ArrayList<Etablissement>();
        
        /* une assosciation dans les 2 sens : un enseignant appartient un seul etablissement
        donc on a créer un array list de type etablissement  */
        
}
class Etablissement { /* création d'une classe atablissement */ 
	public String nometablissemenet; /* un attrbiut interne dans la classe */
	Enseignant enseignant=new Enseignant(); 
        /* une assosciation dans les 2 sens un etablissement peut contenir plusieurs enseignant
        dans on a crée un objet enseignant dans la classe etablissemnt */ 
        
}
