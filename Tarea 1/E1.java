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
public class E1 {
    
    String f[];
    int d, dia;
    int m;
    int a, s;
    String año;
    
    public void dia(String fecha){
    
        f=fecha.split("/");
        if (f.length==3) {
           d=Integer.parseInt(f[0]);
           m=Integer.parseInt(f[1]);
           s=Integer.parseInt(f[2].substring(0,2));
           a=Integer.parseInt(f[2].substring(2,4));
           
           
           dia = (d+mes(m)+a+(a/4)+kAño(s))%7;
//            System.out.println(dia);
//            System.out.println(d);
//            System.out.println(mes(m));
//            System.out.println(a);
//            System.out.println(a/4);
//            System.out.println("siglo "+s);
//            System.out.println("año "+kAño(s));
            
                 System.out.println("El dia de la fecha "+fecha+" es: "+mostrarDia(dia));
               
            
           
        }
    
    
    }
    
    
 
    
    public String mostrarDia(int tot){
        switch(tot){
            case 0:
                return "domingo";
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            case 6:
                return "sabado";
        }
    return "error";
    } 
    
    public int mes(int m){
    
     switch(m){
            case 1:
                return 0;
            case 2:
                return 3;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 6;
            case 8:
                return 2;
            case 9:
                return 5;
            case 10:
                return 0;
            case 11:
                return 3;
            case 12:
                return 5;
        }
    
    return 0;
    }
    
    public int kAño(int S){
     switch(s){
            case 17:
                return 4;
            case 18:
                return 2;
            case 19:
                return 0;
            case 20:
                return 6;
            case 21:
                return 4;
            case 22:
                return 2;
            case 23:
                return 0;
            case 24:
                return 6;
            
        }
     return 1;
    }
}
