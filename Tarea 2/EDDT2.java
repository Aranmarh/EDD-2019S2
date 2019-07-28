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
public class EDDT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bolsa b = new bolsa();
        b.bolsavacia();
       b.insertarbolsa(1,b.primero);
     
        b.insertarbolsa(2,b.primero);
        b.insertarbolsa(3,b.primero);
        b.insertarbolsa(4,b.primero);
        b.mostrarBolsa();
      b.cuantos(b.primero);
    }
    
}
