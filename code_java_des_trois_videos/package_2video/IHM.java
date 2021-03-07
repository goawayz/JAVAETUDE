import java.util.ArrayList;
public class IHM {  /* création de la classe ihm */ 
    /* remarque la classe ihm ne contient aucun attribut */
    /* mais il ya une assosiation dans les 2 sens donc il ya un objet de type gestion de stock */
    GestionDeStock gestiondestock=new GestionDeStock () ;
    MenuPrincipale menuprincipale=new MenuPrincipale (); 
    /* association d'une seul sens donc comme d'habitude 
    on a créer un objet menuprincipale */
    ArrayList<Article>listArticle=new ArrayList<Article>(); 
    //j'ai modifier
    /* déclaration array list de type article car il ya une composition */ 
   
    public void start() {} /* méthode de type voide nommée start */ 
}
