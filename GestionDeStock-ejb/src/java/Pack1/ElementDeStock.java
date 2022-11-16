/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.io.Serializable;

/**
 *
 * @author haitam
 */
public class ElementDeStock implements Serializable {
    
    private Produit refProduit;

    private int quantite;
    
    public ElementDeStock() {}
    
    public ElementDeStock(Produit refProduit, int quantite) {
        this.refProduit = refProduit;
        this.quantite = quantite;
    }

    /**
     * Get the value of quantite
     *
     * @return the value of quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Set the value of quantite
     *
     * @param quantite new value of quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
    /**
     * Get the value of refProduit
     *
     * @return the value of refProduit
     */
    public Produit getRefProduit() {
        return refProduit;
    }

    /**
     * Set the value of refProduit
     *
     * @param refProduit new value of refProduit
     */
    public void setRefProduit(Produit refProduit) {
        this.refProduit = refProduit;
    }

}
