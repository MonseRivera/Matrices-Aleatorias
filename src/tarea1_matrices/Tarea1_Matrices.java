
package tarea1_matrices;

import java.util.Random;
import java.util.Scanner;

public class Tarea1_Matrices {

    //Agragaremos el metodo Random con la variable "ale" para los numeros
    public static void main(String[] args) {
        Random ale =new Random();
        Scanner sc = new Scanner (System.in);
        
        //Pedimos al usuario ingresar el n° de filas y columnas
    System.out.println("Ingresa el primer valor del tamaño de la matriz");
    int tam = sc.nextInt();
    System.out.println("Ingresa el segundo valor del tamaño de la matriz");
    int tam2 = sc.nextInt();
    
        //Formamos nuestra matriz con los dados ingresados
    int [][] Mat = new int [tam][tam2];
    for (int n=0; n <tam; n++){
       
        for (int m = 0; m <tam2; m++){
            
            //Hacemos uso del metodo "random" para asignar los numeros
                //en nuestro caso del 0 a 100
            Mat[n][m] = ale.nextInt(100);    
    }
    }
    
    //Imprimimos la matriz
    System.out.println("La matriz es la siguiente: \n");
    
    for (int n=0; n<tam; n++){
       
        for (int m = 0; m < tam2; m++){
             System.out.print( " | "+Mat[n][m]);
    }
        System.out.println("");
    }
    
    //Ejercicio2 obj= new Ejercicio2();
    //obj.Ejer2();
    }
    }
    

