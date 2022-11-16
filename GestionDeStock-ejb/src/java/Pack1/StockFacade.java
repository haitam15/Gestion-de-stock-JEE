/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author haitam
 */
@Stateless
public class StockFacade extends AbstractFacade<Stock> {

    @PersistenceContext(unitName = "GestionDeStock-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StockFacade() {
        super(Stock.class);
    }
    
    public boolean creer(String nomStock) {
        Stock stock = find(nomStock);
        if(stock!=null)
            return false;
        stock = new Stock(nomStock);
        em.persist(stock);
        return true;
    }
    
    public boolean entreEnStock(String nomStock, Produit refProduit, int quantite) {
        Stock stock = find(nomStock);
        if(stock==null)
            return false;
        for(ElementDeStock e : stock.getListeStock().getListeDeStock()) {
            if(e.getRefProduit().getReferenceProduit().equals(refProduit.getReferenceProduit()))
                return false;
        }
        stock.getListeStock().getListeDeStock().add(new ElementDeStock(refProduit, quantite));
        em.merge(stock);
        return true;
    }
    
    public boolean sortieDeStock(String nomStock, Produit refProduit) {
        Stock stock = find(nomStock);
        if(stock==null)
            return false;
        for(ElementDeStock e : stock.getListeStock().getListeDeStock()) {
            if(e.getRefProduit().getReferenceProduit().equals(refProduit.getReferenceProduit())) {
                stock.getListeStock().getListeDeStock().remove(e);
                em.merge(stock);
                return true;
            }
        }
        return false;
    }

    
    public boolean modifierQuantite(String nomStock, Produit refProduit, int quantite) {
        if(quantite==0)
            return sortieDeStock(nomStock, refProduit);
        Stock stock = find(nomStock);
        if(stock==null)
            return false;
        for(ElementDeStock e : stock.getListeStock().getListeDeStock()) {
            if(e.getRefProduit().getReferenceProduit().equals(refProduit.getReferenceProduit())) {
                e.setQuantite(quantite);
                em.merge(stock);
                return true;
            }
        }
        return false;
    }
    
    public List<Stock> listeStocks() {
        return findAll();
    }
    
    public ListeDeStock listeProduitsStock(String nomStock) {
        Stock stock = find(nomStock);
        if(stock!=null) {
            return stock.getListeStock();
        }
        return null;
    }
    
        /*
    public boolean sortieDeStock(String nomStock, Produit refProduit, int quantite) {
        Stock stock = find(nomStock);
        if(stock!=null)
            return false;
        for(ElementDeStock e : stock.getListeStock().getListeDeStock()) {
            if(e.getRefProduit().getReferenceProduit().equals(refProduit.getReferenceProduit())) {
                if(e.getQuantite()-quantite > 0)
                    e.setQuantite(e.getQuantite() - quantite);
                else
                    stock.getListeStock().getListeDeStock().remove(e);
                em.merge(stock);
                return true;
            }
        }
        return false;
    }
    */

}
