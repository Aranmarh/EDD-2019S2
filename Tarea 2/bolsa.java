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
public class bolsa {
     NodoBolsa primero;
    NodoBolsa ultimo;
    
     public bolsa(){
        primero=null;
        ultimo= null;
        
    }
     
     public boolean bolsavacia(){
     
         if(primero==null){ 
             System.out.println("Esta Vacia");
             System.out.println("");
             return true;
         }
         System.out.println("No esta Vacia");
         System.out.println("");
         return false;
     }
     
     public void insertarbolsa(int elemento, NodoBolsa bolsa){
         NodoBolsa nuevo = new NodoBolsa(elemento,bolsa);
         if (bolsavacia()) {
             primero = nuevo;
             ultimo = primero;
             ultimo.setSiguiente(primero);
         }else{
             ultimo.setSiguiente(nuevo);
             ultimo=nuevo;
             ultimo.setSiguiente(primero);
             
         
         }
     
     }
     
     
     public void mostrarBolsa(){
         NodoBolsa actual=primero;
     do{
         System.out.println(actual.getElemento());
         actual= actual.getSiguiente();
     
     }while(actual!=primero);
     
         System.out.println(actual.getElemento());
     
     }
     
      public void cuantos(NodoBolsa bola){
         NodoBolsa actual=primero;
         int count=0;
     do{
         count++;
         actual= actual.getSiguiente();
     
     }while(actual!=primero);
     
         System.out.println("hay "+count+" bolsas en la lista");
     
     }
}
