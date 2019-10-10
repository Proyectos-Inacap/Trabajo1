//CONJUNTO DE NUMEROS ENTEROS Y DETERMINA EL MAYOR NEGATIVO Y EL MENOR POSITIVO


package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

    
    public static void main(String[] args) {
        

	//creacion del objeto Scanner llamado entrada
        Scanner entrada = new Scanner (System.in);
	//inicializacion de variables
        int cant = 0;
        int num;
        int cont = 1;
        int pos = 0;
        int neg = 0;    
        boolean switchN = true;
        
        //inicio de estructura try
        while(cant == 0){//Bucle repetición try
            try{//Validación de ingreso de datos solicitados
                System.out.print("Ingrese cantidad de números que desea ingresar: "); //consulta cantidad de numeros a ingresar      
                cant = entrada.nextInt(); //lee cantidad de numeros ingresados
            }catch(Exception e) //valida que el dato sea un entero (int)
            {
                System.out.println("Debe ingresar un numero entero"); //muestra por pantalla que el dato es incorrecto
                entrada.nextLine();
            }//fin estructura key   
        
        }//End While
        
        while(switchN){//Bucle para try
            
            try {//Validación de datos ingresados
                
                while (cont <= cant){ //inicio ciclo while para el contador
                    num = 0; //Rainiciar variable para reutilización del valor 0;
                    System.out.print("Ingrese número "+cont+" de "+cant+ ": "); //consulta el numero que desea ingresar de cuantos
                    num = entrada.nextInt(); //lee el numero ingresado 
                    if(cont == 1){ //inicio ciclo if para guardar el primer numero ingresado
                        if(num<0){ //if para saber si el primer numero ingresado es positivo o negativo
                            neg=num; //si es negativo
                        }//End If
                        else if(num>0){//Validar que el número sea mayor que 0
                            pos=num; //si es positivo
                        } //fin del ciclo para guardar el primer termino
                    }else{ //comienza la comparacion con el resto de los numeros
                        if(num > 0){ //si el numero ingresado es menor al positivo guardado
                            if(pos == 0){//Validar si el pos tiene valor 0
                                pos = num; //Guardar el valor pos inicial
                            }else if (num <= pos) {//Validar si num es menor que pos
                                pos = num;//Almacenar valor menor en pos
                            }//End If
                        }//End If
                        if(num <= neg && 0 > num){ //si el numero ingresado es mayor al negativo guardado
                            neg = num; //guardar el numero mayor                   }
                        } //fin ciclo if de guardar numero
                    } //fin ciclo while
                    cont = cont + 1; //sumar contador para la consulta de numero a ingresar
                    if (num != 0) {//Validación de si num es desigual a 0
                    switchN = false; //Apaga el interruptor
                    }//End IF
                }//End While
                System.out.println("El número mayor negativo ingresado es "+neg); //muestra por pantalla el mayor negativo
                System.out.println("El número menor positivo ingresado es "+pos); //muestra por pantalla el menor positivo
            } catch (Exception e) {//Manejo de excepción
                System.out.println("Ingreso incorrecto.");//Muestra al usuario el ingreso incorrecto
                switchN = true; //Encender interruptor
                entrada.nextLine();//Vacia el objeto Scanner
                
            }//End Try
            
        }//End While
        
    }//End Main
}//End Class