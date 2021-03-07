class GestionDeStock {  /* création de la classe gestion de stock */ 
    public String nom,adresse; /* la meme chose on déclare notre attributs */ /* interne dans la classe */
    Stock stock=new Stock () ; 
    /*on a une association dans un seul sense l'association de gestion du stock
    vers stock */ /* alors on a un objet de type stock */ 
    
    IHM ihm =new IHM () ; /* un objet de type ihm par ce que l'association est dans les 2 sens */ 
}
