//Ejercicio 1: Conjunto de palabras, con longitud máxima y mínima. 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author christian_aqueveque
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación del objeto Scanner llamado read
        Scanner read = new Scanner(System.in);
        
        //Primer ejercicio
        
        int numberWords = 0; //Variable cantidad de palabras a comparar.
        
        boolean switchTry = true; //Variable interruptor.
        
        String wordComp; //Variable primera palabra ingresada.
        
        String wordMin = ""; //Variable con menos caracteres.
        
        String wordMax = ""; //Variable con más carácteres.
        
        while(switchTry){ /*Repetir la cantidad de palabras ingresadas en caso
        de error del ingreso*/
            
            try { //Validación de datos ingresados son correctos.
                
                System.out.print("Indique cuantas palabras desea comparar: "); /* Consulta 
                de la cantidad de palabras a comparar. */
        
                numberWords = read.nextInt(); /* Almacenar en variable la cantidad de
                palabras a comparar. */
                
                if (numberWords != 0) { /* Apagar interruptor en caso de que ingreso
                sea correcto. */
                    
                    switchTry = false; //Apagar interruptor.
                }
            
            } catch (Exception e) { //Manejar excepción.
                
                System.out.println("Ingreso inválido"); //Indicar ingreso erroneo.
                
                read.nextLine(); //Vaciar objeto Scanner
            }
        }
        
        read.nextLine(); //Vaciar objeto Scanner
        
        for (int i = 1; i <= numberWords; i++) { /* Bucle para el ingreso de 
        palabras. */
            
            System.out.print("Ingrese palabra " + i + " de " + numberWords + ": ");
            //Soliciitud de ingreso de palabras.
            
            wordComp = read.nextLine(); //Almacenar palabra ingresada.
            
            if (i == 1) { //Validación de primer término ingresado.
                
                wordMin = wordComp; //Almacenar en variable min.
                
                wordMax = wordComp; //Almacenar en variable max.
                
            }else if (wordComp.length() < wordMin.length()) { /* En caso de no 
            ser el primero, comparar entre palabra ingresada y variable min. */
                
                wordMin = wordComp; //Almacenar en variable min.
                
            }else if (wordComp .length() > wordMax.length()) { /* Comparación de 
            palabra ingresada y variable max. */
                
                wordMax = wordComp; //Almacenar variable max.
            }
            
        }
        
        System.out.println("La palabra con mayor carácteres ingresados es: " + wordMax);
        //Muestra al usuario la palabra con menor carácteres.
        
        System.out.println("La palabra con menor carácteres ingresados es: " + wordMin);
        //Muestra al usuario la palabra con mayor carácteres.
    }
    
}
