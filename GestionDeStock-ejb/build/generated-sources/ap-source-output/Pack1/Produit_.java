package Pack1;

import Pack1.Marque;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-16T18:53:54")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, String> referenceProduit;
    public static volatile SingularAttribute<Produit, Double> volume;
    public static volatile SingularAttribute<Produit, Double> prix;
    public static volatile SingularAttribute<Produit, Double> poids;
    public static volatile SingularAttribute<Produit, Marque> marqueProduit;
    public static volatile SingularAttribute<Produit, String> denomination;

}