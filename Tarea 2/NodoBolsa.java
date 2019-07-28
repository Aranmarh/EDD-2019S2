/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddt2;

/**
 *
 * @author Aran
 */
public class NodoBolsa {
    int elemento;
    NodoBolsa siguiente;

    public NodoBolsa(int elemento, NodoBolsa siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NodoBolsa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoBolsa siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
