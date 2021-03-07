import java.util.ArrayList;
public class Stock { //créaration d'une classe public stock 
    public String identification ;
    public int id;              /* 2 attributs */
    ArrayList<Article>listArticle=new ArrayList<Article>();
    /* array list de type article " complexe " 
    on a utilisé array list par ce que on a un tableau dynamique avec aggregation */
    public Stock () {} /* déclaration du constructeur */
    public Stock (String identification, int id )
     { /* un autre constructeur avec une different signature */
        /* comme cité dans la vidéo */ 
    this.identification = identification ;
    this.id = id ;
    /* il ya un constructeur vide mais le deuxieme est avec deux parametre */
            }
}
