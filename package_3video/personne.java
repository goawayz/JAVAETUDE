package dz.abdo.program;//the package containn

import java.util.ArrayList;

public class personne /* cr�eation d'une classe public personne */ 
{
    /* on peut utliser les attributs comme public par ce qu'il  ya + dans la classe
    mais on a utilisant protected car il ya un h�ritage donc les attributs de la classe pere " personne " sont protected*/
    
	protected String nom,prenom; 
	protected int age;

}
class Etudiant extends personne{} 
/* creation d'une classe fils " etudiant" depuis la classe pere "personne" /h�ritage/ */ 
class Enseignant extends personne{ 
    /* cr�ation d'une classe fils "Enseignant " depuis la classe pere "personne" /h�ritage/ */ 

	ArrayList<Etablissement>listetablissement=new ArrayList<Etablissement>();
        
        /* une assosciation dans les 2 sens : un enseignant appartient un seul etablissement
        donc on a cr�er un array list de type etablissement  */
        
}
class Etablissement { /* cr�ation d'une classe atablissement */ 
	public String nometablissemenet; /* un attrbiut interne dans la classe */
	Enseignant enseignant=new Enseignant(); 
        /* une assosciation dans les 2 sens un etablissement peut contenir plusieurs enseignant
        dans on a cr�e un objet enseignant dans la classe etablissemnt */ 
        
}
