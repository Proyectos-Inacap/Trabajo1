//Ejercicio 5: Lanzamiento de dado.


package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese cantidad de tiros: ");
       int cant = entrada.nextInt(); //lee el numero ingresado
       int cont=1;
       while(cont<=cant){ //hace que el ejercicio se repita las veces que se ingreso
            int val =(int) (Math.random()*5)+1; //valida
            System.out.println("El numero del tiro "+cont+" es: "+val);
           cont++;
       }
    }
    
}
