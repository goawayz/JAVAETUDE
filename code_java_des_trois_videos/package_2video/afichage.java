public class afichage//cre�r la class afichage public
{

	public static void main(String[] args)//la class execuatable 
	{	
		Article cp= new Article();			//creat object cp from class atricle
		cp.setqte(20);            			//set la valeur 20 a l'object cp
		
								  			//affichage de la qte (quantité) 
		System.out.println("\nla Quantité de ce Article : "+cp.getqte());

	}

}
