/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddt1;

import java.util.Scanner;

/**
 *
 * @author Aran
 */
public class Menu {
    
    String n;
    boolean entrada=true;
    boolean tipo=true;
    Scanner leer = new Scanner(System.in);
    String fecha;
    int numero;
    
    E1 e1 = new E1();
    E2 e2 = new E2();
    
     public void mostrar(){
        while(entrada){
        System.out.println("Bienvenido a la Tarea 1 201408507");
        System.out.println("Por favor escoja el ejercicio con el que quiera interactuar");
        System.out.println("1. Fecha");
        System.out.println("2. Primos");
        System.out.println("Precione cualquier tecla para salir");
        n=leer.next();
        switch (n){
            case "1":
                System.out.println("");
             
                System.out.println("Inserte Fecha:");
                fecha=leer.next();
                e1.dia(fecha);
                break;
            case "2":
                System.out.println("");
                System.out.println("Inserte numero a evaluar");
                numero= leer.nextInt();
                e2.primo(numero);
               // Pila();
                break;

            default:    
                System.out.println("salio");
                entrada=false;
                break;
        }
        
            System.out.println("");
            System.out.println("");
    }
            
    }
     
    
    
}
