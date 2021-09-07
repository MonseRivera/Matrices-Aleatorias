
package tarea1_matrices;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio2 {
    public void Ejer2 () {
        //Agragaremos el metodo Random con la variable "ale" para los numeros
        Random ale =new Random();
        Scanner sc = new Scanner (System.in);
        
        //Pedimos al usuario ingresar el tamaño del vector
    System.out.println("Ingresa el valor de tu vector");
    int tam = sc.nextInt();
    
        //Formamos nuestro vector
        
    int [] Vect = new int [tam];
    int suma=0;
        for(int n=0; n<tam; n++){
            
         //Hacemos uso del metodo Random   
            Vect[n] = ale.nextInt(200-100+1)+100;
        }   
        //Colocamos otro for para que recorra los lugares a sumar con los numeros obtenidos
        for(int n=0; n<Vect.length; n++){
            suma+=Vect[n];
        }
        //Imprimimos el vector
        System.out.println("Tu vector es el siguiente: \n");
        for (int n=0; n<tam; n++){
            System.out.print( " | " +Vect[n]);
        }
        //Imprimimos el resultado de la suma
        System.out.println("");
        System.out.println("Al sumar el resultado es: "+suma);
        }
}
