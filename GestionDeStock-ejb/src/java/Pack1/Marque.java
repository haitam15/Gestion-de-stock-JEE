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
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author haitam
 */
@Entity
public class Marque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String nomMarque;

    private String origineDeFabrication;
    
    @OneToMany
    public List<Produit> listeDesProduits = new ArrayList<Produit>();
    
    public Marque() {}
    
    public Marque(String nomMarque, String origineDeFabrication) {
        this.nomMarque = nomMarque;
        this.origineDeFabrication = origineDeFabrication;
    }

    /**
     * Get the value of origineDeFabrication
     *
     * @return the value of origineDeFabrication
     */
    public String getOrigineDeFabrication() {
        return origineDeFabrication;
    }

    /**
     * Set the value of origineDeFabrication
     *
     * @param origineDeFabrication new value of origineDeFabrication
     */
    public void setOrigineDeFabrication(String origineDeFabrication) {
        this.origineDeFabrication = origineDeFabrication;
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomMarque != null ? nomMarque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marque)) {
            return false;
        }
        Marque other = (Marque) object;
        if ((this.nomMarque == null && other.nomMarque != null) || (this.nomMarque != null && !this.nomMarque.equals(other.nomMarque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pack1.Marque[ id=" + nomMarque + " ]";
    }
    
}
