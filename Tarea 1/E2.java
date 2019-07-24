/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddt1;

/**
 *
 * @author Aran
 */
public class E2 {
    
    
    public void primo(int x){
       int i,j;
  boolean esPrimo;
  int rInicial=x;//Rango inicial, este debe ser mayor de 1.
  int rFinal = 2000;//Rango final.
  for(i = rInicial;i <= rFinal;i++){
  //recorro ciclo tantas veces como necesite(<= es para incluir el valor de rFinal).
      esPrimo=true;// i es primo hasta que se demuestre lo contrario, jejejejeje.
       for(j = 2;j < i;j++){
       //no coloque j = 1 porque ya sabemos que todo numero es divisible por 1.
       /*j < i es para no incluir el numero a evaluar, pues todo numero es divisible
       por si mismo.*/
       if(i % j == 0){//Si además del 1 y el mismo hay otro divisor, ya no es primo.
         //% devuelve el residuo de i/j
          esPrimo = false;//se demostró que i no es primo.
       }
       }
       if(esPrimo){//Si es primo lo imprimo.
        System.out.println(i+"\n");
       }
  }
    
    }
    
}
