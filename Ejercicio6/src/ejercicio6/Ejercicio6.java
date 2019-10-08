/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author christian_aqueveque
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in); //Creación de objeto Scanner
        
        int numFirst = 0; //Variable para inicio de intervalo.
        
        int numLast = 0; //Variable para término de intervalo.
        
        int sum; //Variable suma de divisores.
        
        int total = 0; //Variable cantidad de números perfectos.
        
        while(numLast == 0){ //Bucle validación de try.
            
            try { //Validación de datos ingresados.
                
                System.out.print("Indique el inicio del intervalo: ");
                //Solicita el inicio del intervalo.
                
                numFirst = read.nextInt(); //Se almacena en variable el inicio.
                
                System.out.print("Indique el final del intervalo: ");
                //Solicita el término del intervalo.
                
                numLast = read.nextInt(); //Se almacena en variable el término.
                
            } catch (Exception e) { //Manejo general de excepción.
                
                System.out.println("El ingreso es incorrecto.");
                //Muestra al usuario que datos ingresados son inválidos.
                
                read.nextLine(); //Vaciar objeto Scanner.
                
            }//End Try
            
        }//End While
        
        while(numFirst <= numLast){ //Bucle aumento de inicio intervalo.
            
            sum = 0; //Reseteo de variable para reutilización en for.
            
            for (int i = 1; i < numFirst; i++) { //Bucle para encontrar divisores.
                
                if (numFirst % i == 0) { //Validación para identificar divisores.
                    
                    sum = sum + i; //Suma de divisores.
                    
                }//End If
                
            }//End For
            
            if (sum == numFirst) { //Comparación de suma de divisores con inicio intervalo.
                    
                    System.out.println("El número " + numFirst + " es perfecto.");
                    //Muestra al usuario número perfecto.
                    
                    total = total + 1; //Aumenta en 1 la cantidad de n. perfectos.
                    
            }//End If
            
            numFirst = numFirst + 1; //Aumenta inicio intervalo en 1.
            
        }//End While
        
        System.out.println("El total de números perfectos son " + total);
        //Muestra al usuario el total de números perfectos encontrados.
        
    }//End Main
    
}//End Class
