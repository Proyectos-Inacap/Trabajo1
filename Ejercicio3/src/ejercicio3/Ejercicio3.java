//Ejercicio 3: Conjunto de notas. Con mayor, menor y promedio.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author christian_aqueveque
 */

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in); //Creación del objeto Scanner.
        
        int maxNotas = 0; //Variable para el total de notas ingresadas.
        
        double notaMin = 0; //Variabe para nota menor ingresada.
        
        double notaMax = 0; //Variable para nota mayor ingresada.
        
        double nota; //Variable para el ingreso de notas.
        
        double promedio = 0; //Variable para el promedio.
        
        boolean switchN = true; //Variable interruptor.
        
        while(switchN){ //Bucle para repetición de try.
            
            try { //Validación para el ingreso erróneo de datos.
            
                System.out.print("Indique cuantas notas desea ingresar: "); /* Solicitar
                el ingreso de máximo de notas al usario. */
            
                maxNotas = read.nextInt(); //Almacenar la nota ingresada.
                
                if (maxNotas != 0) { //Validación para apagar interruptor.
                    
                    switchN = false; //Apagar interruptor.
                    
                } //End If
            
            } catch (Exception e) {
            
                System.out.println("El ingreso es incorrecto."); /* Aviso al usuario de
                ingreso incorrecto. */
            
                read.nextLine(); //Vaciar el objeto Scanner.
            
            } //End Try
            
        } //End While
        
        for (int i = 1; i <= maxNotas; i++) { /* Bucle para ingreso de notas según
        cantidad solicitada por usuario. */
            
            switchN = true; //Encender interruptor.
            
            nota = 0; //Inicialización valor de nota.
            
            while(switchN){ //Bucle para repetición de try.
                
                try { //Validación de ingreso de datos erróneos.
                
                    System.out.print("Ingrese nota " + i + " de " + maxNotas + ": ");
                    //Indica al usuario la nota a ingresar.
            
                    nota = read.nextDouble(); //Almacenar el valor ingresado en nota.
                    
                    if(nota >= 1 && nota <= 7){ /* Validación de valor almacenado en nota
                    cumpla con requisitos para ser nota. */
                
                        if (i == 1) { //Verificar si es el primer término ingresado.

                        notaMin = nota; //Almacenar valor ingresado en nota mínima.

                        notaMax = nota; //Almacenar valor ingresado en nota máxima.

                        promedio = nota; //Almacenar valor ingresado en promedio.

                        }else if (nota < notaMin) { /*Si no es el primero verifica si la
                        menor nota ingresada. */

                        notaMin = nota; //Almacenar nota mínima.

                        promedio = promedio + nota; //Sumar promedio

                        }else if (nota > notaMax) { /* si no es la menor nota ingresada
                        verifica si es la mayor. */

                        notaMax = nota; //Almacenar nota mínima.

                        promedio = promedio + nota; //Sumar promedio.

                        } //End If
                
                    }else{ //Si no cumple requisitos para ser nota.
                
                        System.out.println("El valor ingresado no es una nota válida.");
                        //Muestra al usuario que el valor no cumple los requisitos.
                
                        i = i - 1; //Decrementa la variable del bucle.
                
                    } //End If
            
                    
                    if (nota != 0) { //Validación para apagar interruptor.
                        
                        switchN = false; //Apagar interruptor.
                        
                    } //End If
                
                } catch (Exception e) {
                    
                    System.out.println("Ingreso incorrecto."); /* Muesta al usuario
                    Que el ingreso es inválido. */

                    read.nextLine(); //Vaciar Objeto Scanner.
                    
                } //End Try
                
            } //End While
            
        } //End For
        
        System.out.println(promedio);
        
        promedio = promedio / maxNotas; //Divide el promedio por la cantidad de notas.
        
        System.out.println("La nota mínima ingresada es " + notaMin); /* Muestra
        al usuario la nota mínima ingresada. */
        
        System.out.println("La nota máxima ingresada es " + notaMax); /* Muestra
        al usuario la nota máxima ingresada. */
        
        System.out.print("El promedio de las notas ingresadas es "); /* Muestra al
        usuario el mensaje del promedio. */
        
        System.out.printf("%.1f%n" , promedio); /* Muestra al usuario el promedio
        con el formato requerido. */
        
    }//End Main
    
}//End Class
