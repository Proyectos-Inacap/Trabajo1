//Ecuacion Segundo Grado
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double a, b, c;
        
        System.out.print("Ingrese término a: ");
        a = entrada.nextDouble();
        System.out.println(a+"x^2");
        System.out.print("Ingrese término b: ");
        b = entrada.nextDouble();
        System.out.println(a+"*x^2 "+b+"x");
        System.out.print("Ingrese término c: ");
        c = entrada.nextDouble();
        System.out.println(a+"*x^2 "+b+"x " +c);
        
        double neg = (b*-1);
        double b1 = Math.pow(b, 2);
        double b2 = (4*a*c);
        double d = (2*a);
        double b3 = (b1-b2);
        
        if(b3>=0){            
            double b4 = Math.pow(b3, 0.5);
            double b5 = ((neg-b4)/d);
            double b6 = ((neg+b4)/d);

            System.out.println("El resultado de su ecuacion es x=:"+b6+", y="+b5);
        }
        else{
            System.out.println("El resultado no se encuentra entre los reales");
        }
        
    }
    
}
