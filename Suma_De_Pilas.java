
package suma_de_pilas;

import java.util.Scanner;
import java.util.Random;

public class Suma_De_Pilas {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
      Random ale =new Random();
      
      int tope=0, opt=0;
      System.out.println("Ingresa el tamaño de la pila");
      int tam = sc.nextInt();
      
      int[] pilaA = new int [tam];
      int[] pilaB = new int [tam];
      
      int[] pilaC = new int [tam + tam];
      
      do{
         System.out.println("\n1- Llenar pilas A y pila B\n"
         + "2- Mostrar pilas A y B\n"
         + "3- Vaciar pilas A y B\n"
         + "4- Unir pilas\n"
         + "5- Mostrar pila C\n"
         + "6- Salir");
        switch (opt = sc.nextInt()){
            case 1:
                System.out.println("valores agregados");
                for (int i = 0; i < tam; i++){
                    pilaA[i] = ale.nextInt(100-1+1)+1;
                }
                for (int i = 0; i < tam; i++){
                    pilaB[i] = ale.nextInt(200-100+1)+100;
                }
                break;
            case 2:
                System.out.println("\n pila A");
                for(int i = tam-1; i>=0; i--){
                    System.out.println(" " + pilaA[i]);
                }
                System.out.println("\n pila B");
                for(int i = tam-1; i>=0; i--){
                    System.out.println(" " + pilaB[i]);
                }
                break;
            case 3:
                if(tam > 0){
                        System.out.println("Atencion" + " " + "dato eliminado!" + " " +tam);
                        tam--;
                    } else {
                        System.out.println("Atencion" + " " + "no hay datos para eliminar...");
                    }
                break;
                //Desde aqui mplementamos la suma de las filas respetando 
                //el que entra al ultimo - entra primero
            case 4:
                System.out.println("Union de pilas hechas");
                int aux= 0;
                
                for(int i=tam -1; i>=0; i--){
                    pilaC[aux] = pilaA[i]+pilaB[i];
                    System.out.println("posicion:  " +i+ "  tiene el dato:  " +pilaC[i]);
                    aux++;    
                }
                for(int j=tam -1; j>=0; j--){
                    pilaC[aux] = pilaB[j]+pilaA[j];
                    System.out.println("posicion:  " +j+ "  tiene el dato:  " +pilaC[j]);
                    aux++; 
                }
                break;
            case 5:
                System.out.println("\n pila C");
                for(int i = (tam)-1; i>=0; i--){
                    System.out.println(" " + pilaC[i]);
                }
                break;
        }
        
        }while (opt !=6);
    
    }
}

