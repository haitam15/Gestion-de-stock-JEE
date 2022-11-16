/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haitam
 */
public class ListeDeStock implements Serializable {
    
    private List<ElementDeStock> listeDeStock = new ArrayList<ElementDeStock>();
    
    public ListeDeStock() {}
    
    public ListeDeStock(List<ElementDeStock> listeDeStock) {
        this.listeDeStock = listeDeStock;
    }

    /**
     * Get the value of listeDeStock
     *
     * @return the value of listeDeStock
     */
    public List<ElementDeStock> getListeDeStock() {
        return listeDeStock;
    }

    /**
     * Set the value of listeDeStock
     *
     * @param listeDeStock new value of listeDeStock
     */
    public void setListeDeStock(List<ElementDeStock> listeDeStock) {
        this.listeDeStock = listeDeStock;
    }

    
}
