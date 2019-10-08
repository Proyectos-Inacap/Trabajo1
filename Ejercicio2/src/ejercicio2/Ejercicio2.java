//CONJUNTO DE NUMEROS ENTEROS Y DETERMINA EL MAYOR NEGATIVO Y EL MENOR POSITIVO
package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

    
    public static void main(String[] args) {
        

	//creacion del objeto Scanner llamado entrada
        Scanner entrada = new Scanner (System.in);
	//inicializacion de variables
        int cant;
        int num;
        int cont = 1;
        int pos = 0;
        int neg = 0;       
        
        //inicio de estructura try
        try{   
            System.out.print("Ingrese cantidad de n˙meros que desea ingresar: "); //consulta cantidad de numeros a ingresar      
            cant = entrada.nextInt(); //lee cantidad de numeros ingresados
            while (cont <= cant){ //inicio ciclo while para el contador
                System.out.print("Ingrese numero "+cont+" de "+cant+ ": "); //consulta el numero que desea ingresar de cuantos
                num = entrada.nextInt(); //lee el numero ingresado 
                if(cont == 1){ //inicio ciclo if para guardar el primer numero ingresado
                    if(num<0){ //ciclo if para saber si el primer numero ingresado es positivo o negativo
                        neg=num; //si es negativo
                    }
                    else{
                        pos=num; //si es positivo
                    } //fin del ciclo para guardar el primer termino
                }else{ //comienza la comparacion con el resto de los numeros
                    if(num <= pos && num > 0){ //si el numero ingresado es menor al positivo guardado
                        pos = num; //guardar el numero menor
                    }
                    if(num <= neg && 0 > num){ //si el numero ingresado es mayor al negativo guardado
                        neg = num; //guardar el numero mayor                   }
                } //fin ciclo if de guardar numero
                cont = cont + 1; //sumar contador para la consulta de numero a ingresar
            } //fin ciclo while
            System.out.println("El n˙mero mayor negativo ingresado es "+neg); //muestra por pantalla el mayor negativo
            System.out.println("El n˙mero menor positivo ingresado es "+pos); //muestra por pantalla el menor positivo
        }//End While
        }catch(Exception e) //valida que el dato sea un entero (int)
        {
            System.out.println("Debe ingresar un numero entero"); //muestra por pantalla que el dato es incorrecto
            entrada.nextLine();
        }//fin estructura key   
    }
}