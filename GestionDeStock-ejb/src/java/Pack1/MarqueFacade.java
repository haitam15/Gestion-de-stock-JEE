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
public class MarqueFacade extends AbstractFacade<Marque> {

    @PersistenceContext(unitName = "GestionDeStock-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarqueFacade() {
        super(Marque.class);
    }
    
    public boolean creer(String nomMarque, String origineDeFabrication) {
        Marque m = em.find(Marque.class, nomMarque);
        if(m!=null)
            return false;
        m = new Marque(nomMarque,origineDeFabrication);
        em.persist(m);
        return true;
    }
    
    public boolean supprimer(Marque marque) {
        Marque m = em.find(Marque.class, marque.getNomMarque());
        if(m==null || !marque.listeDesProduits.isEmpty())
            return false;
        remove(marque);
        return true;
    }
    
    public boolean modifier(Marque marque) {
        Marque m = em.find(Marque.class, marque.getNomMarque());
        if(m==null)
            return false;
        em.merge(marque);
        return true;
    }
    
    public List<Marque> listeMarques() {
        return findAll();
    }
    
    public void ajouterProduitMarque(Marque marque, Produit produit) {
        marque.listeDesProduits.add(produit);
        em.merge(marque);
    }
    
    public List<Produit> ListeProduitsMarque(String nomMarque) {
        Marque marque = em.find(Marque.class, nomMarque);
        return marque.listeDesProduits;
    }
    
    public void supprimerProduitMarque(Produit produit) {
        Marque marque = produit.marqueProduit;
        marque.listeDesProduits.remove(produit);
        em.merge(marque);
    }
}
