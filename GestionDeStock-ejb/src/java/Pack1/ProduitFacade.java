/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author haitam
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> {

    @PersistenceContext(unitName = "GestionDeStock-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }
    
    public boolean creer(String referenceProduit, Marque marqueProduit, String denomination, double prix, double poids, double volume) {
        Produit p = em.find(Produit.class, referenceProduit);
        Marque m = em.find(Marque.class, marqueProduit.getNomMarque());
        if(p!=null || m==null)
            return false;
        p = new Produit(referenceProduit,marqueProduit,denomination,prix,poids,volume);
        em.persist(p);
        return true;
    }
    
    public boolean supprimer(Produit produit) {
        Produit p = em.find(Produit.class, produit.getReferenceProduit());
        if(p==null)
            return false;
        remove(produit);
        return true;
    }
    
    public boolean modifier(Produit produit) {
        Produit p = em.find(Produit.class, produit.getReferenceProduit());
        if(p==null)
            return false;
        em.merge(produit);
        return true;
    }
    
    public List<Produit> listeProduits() {
        return findAll();
    }
}
