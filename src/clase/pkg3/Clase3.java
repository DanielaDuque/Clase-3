/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3;
import java.util.*;
/**
 *
 * @author ESTUDIANTE
 * @version 1
 * @since 9 de agosto del 2017 
 */
/**   funcion calcular salario:
 * calcua el salario total de la funcion
 * @param horas: es el numero de horas que trabajo.
 * @param valor: es el valor de la hora de trabajo C/U
 * @return devuelve el valor total del salario segun las siguientes especificaciones: Cuando las horas de trabajo exceden de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga una hora normal y el resto al triple.
 * hola
 */

public class Clase3 {
public static double calcularsalario (int horas, double valor){
     double ac;
       if ( horas <= 40){
           ac = horas * valor;
       } else {
           if (horas >40 && horas <= 48 ) {
               int d= horas - 40;
               ac= (40*valor) + 2*valor*d;
           } else {
               int a = horas-48;
               int d= horas - a- 40;
               ac= (40*valor) + 2*valor*d + 3*valor*a;
           }
       }
    return ac ;

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner flujoEnt = new Scanner (System.in);
        String nombre = null;
        int numHoras = 0;
        double ValorHora= 0;
        double valorPagar =0;
        
        // Lectura de datos
        System.out.println ("Nombre:");
        nombre = flujoEnt.next ();
        
        System.out.println ("Horas Trabajadas:");
        numHoras = flujoEnt.nextInt ();
        
        System.out.println ("Valor Hora:");
        ValorHora = flujoEnt.nextDouble ();
         //invocacion de la funcion
        valorPagar = calcularsalario (numHoras, ValorHora);
        
        System.out.println ( "nombre: " + nombre + ": Salario total " + valorPagar);
        
        
    }
    
}
