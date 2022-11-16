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
import javax.persistence.ManyToOne;

/**
 *
 * @author haitam
 */
@Entity
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    String referenceProduit;

    @ManyToOne
    public Marque marqueProduit;

    private String denomination;

    private double prix;
    
    private double poids;
    
    private double volume;
    
    public Produit() {}
    
    public Produit(String refrenceProduit, Marque marqueProduit, String denomination, double prix, double poids, double volume) {
        this.referenceProduit = refrenceProduit;
        this.marqueProduit = marqueProduit;
        this.denomination = denomination;
        this.prix = prix;
        this.poids = poids;
        this.volume = volume;
    }

    /**
     * Get the value of volume
     *
     * @return the value of volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Set the value of volume
     *
     * @param volume new value of volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }


    /**
     * Get the value of poids
     *
     * @return the value of poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Set the value of poids
     *
     * @param poids new value of poids
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }


    /**
     * Get the value of prix
     *
     * @return the value of prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Set the value of prix
     *
     * @param prix new value of prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * Get the value of denomination
     *
     * @return the value of denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * Set the value of denomination
     *
     * @param denomination new value of denomination
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

   
    public String getReferenceProduit() {
        return referenceProduit;
    }

    public void setReferenceProduit(String referenceProduit) {
        this.referenceProduit = referenceProduit;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referenceProduit != null ? referenceProduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.referenceProduit == null && other.referenceProduit != null) || (this.referenceProduit != null && !this.referenceProduit.equals(other.referenceProduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pack1.Produit[ id=" + referenceProduit + " ]";
    }
    
}
