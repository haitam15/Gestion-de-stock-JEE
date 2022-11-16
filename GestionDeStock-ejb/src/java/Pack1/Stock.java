/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author haitam
 */
@Entity
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String nomStock;

    private ListeDeStock listeStock;
    
    public Stock() {}
    
    public Stock(String nomStock) {
        this.nomStock = nomStock;
        this.listeStock = new ListeDeStock();
    }

    public Stock(String nomStock, ListeDeStock listeStock) {
        this.nomStock = nomStock;
        this.listeStock = listeStock;
    }
    
    /**
     * Get the value of listeStock
     *
     * @return the value of listeStock
     */
    public ListeDeStock getListeStock() {
        return listeStock;
    }

    /**
     * Set the value of listeStock
     *
     * @param listeStock new value of listeStock
     */
    public void setListeStock(ListeDeStock listeStock) {
        this.listeStock = listeStock;
    }

    public String getNomStock() {
        return nomStock;
    }

    public void setNomStock(String nomStock) {
        this.nomStock = nomStock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomStock != null ? nomStock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.nomStock == null && other.nomStock != null) || (this.nomStock != null && !this.nomStock.equals(other.nomStock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pack1.Stock[ id=" + nomStock + " ]";
    }
    
}
