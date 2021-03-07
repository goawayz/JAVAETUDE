class Article { /* création d'une autre classe nommé article mais cette derneier n'est pas public
        car on ne peut pas avoir 2 classes public */
        private int qte ; /* déclaration des attributs de la classe */ /* c'est un attribut privé */
        public String reference;  /* déclaration des attributs de la classe */
        Stock stock=new Stock (); /* création d'un objet de class stock dans la classe article 
        pourquoi ? par ce que on a une association ( 1 ) si il ya une étoile on utilise array list 
        */
        
        public Article () {} /* constructeur */
        public void operation2 () {}
        public int getqte() {  /* Getter de l'attribut privé qte */ 
            return qte;
        }
        public void setqte (int qte) { /* Setter de l'attribut privé qte */ 
            this.qte=qte;
        }
      }