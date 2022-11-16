package Pack1;

import Pack1.Produit;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-16T18:53:54")
@StaticMetamodel(Marque.class)
public class Marque_ { 

    public static volatile ListAttribute<Marque, Produit> listeDesProduits;
    public static volatile SingularAttribute<Marque, String> origineDeFabrication;
    public static volatile SingularAttribute<Marque, String> nomMarque;

}