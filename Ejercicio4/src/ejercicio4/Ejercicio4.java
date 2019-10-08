//Ecuacion Segundo Grado
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {

	//inicio objeto Scanner llamado entrada
        Scanner entrada = new Scanner(System.in);
        
	//variables
        double a, b, c;
             
        //inicia ciclo try
        try
        {        
            System.out.print("Ingrese término a: "); //ordena a ingresar un termino 
            a = entrada.nextDouble(); //lee el primer termino
            System.out.println(a+"x^2"); //muestra como va quedando la ecuacion
            System.out.print("Ingrese tÈrmino b: "); //ordena segundo numero
            b = entrada.nextDouble(); //lee el segundo termino
            System.out.println(a+"*x^2 "+b+"x"); //muestra como va quedando la ecuacion
            System.out.print("Ingrese tÈrmino c: ");//ordena tercer numero
            c = entrada.nextDouble(); //lee el tercer termino
            System.out.println(a+"*x^2 "+b+"x " +c); //muestra como va quedando la ecuacion
         
            double neg = (b*-1); //multiplica el segundo termino por -1
            double b1 = Math.pow(b, 2); //eleva el segundo termino al cuadrado
            double b2 = (4*a*c); //multiplica el primer y tercer termino y un numero 4
            double d = (2*a); //multiplica el primer termino por un 2
            double b3 = (b1-b2); //resta el segundo resultado con el tercer resultado
            
            if(b3>=0){ //inicio ciclo if si es que el sexto resultado es positivo
                double b4 = Math.pow(b3, 0.5); //saca la raiz cuadrada del sexto resultado
                double b5 = ((neg-b4)/d); //el primer resultado menos la raiz cuadrada divido el cuarto resultado
                double b6 = ((neg+b4)/d); //el primer resultado mas la raiz cuadrada divido el cuarto resultado

                System.out.println("El resultado de su ecuacion es x=:"+b6+", y="+b5); //muestra por pantalla los resultados del if
            }
            else{
                System.out.println("El resultado no se encuentra entre los reales"); //muestra por pantalla si es que el sexto resultado da negativo
            }
        }
        catch(Exception e) //valida en que el dato ingresado sea un numero
        {
            System.out.println("Debe ingresar un n˙mero..."); //muestra por pantalla si el dato ingresado es incorrecto
        } //fin ciclo try
    } 
}
