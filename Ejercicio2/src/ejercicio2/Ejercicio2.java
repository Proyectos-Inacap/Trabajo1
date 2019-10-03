//CONJUNTO DE NUMEROS ENTEROS Y DETERMINA EL MAYOR NEGATIVO Y EL MENOR POSITIVO
package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int cant;
        int num;
        int cont = 1;
        int pos = 0;
        int neg = 0;       
        
        
        try{   
            System.out.print("Ingrese cantidad de números que desea ingresar: ");       
            cant = entrada.nextInt();
            while (cont <= cant){
                System.out.print("Ingrese numero "+cont+" de "+cant+ ": ");
                num = entrada.nextInt();
                if(cont == 1){
                    if(num<0){
                        neg=num;
                    }
                    else{
                        pos=num;
                    }
                }else{
                    if(num <= pos && num > 0){ 
                        pos = num;
                    }
                    if(num <= neg && 0 > num){
                        neg = num;
                    }
                }
                cont = cont + 1;
            }
            System.out.println("El número mayor negativo ingresado es "+neg);
            System.out.println("El número menor positivo ingresado es "+pos);
        }
        catch(Exception e)
        {
            System.out.println("Debe ingresar un numero entero");
            entrada.nextLine();
        }    
    }
}
