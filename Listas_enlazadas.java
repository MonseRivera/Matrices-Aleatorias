
package listas_enlazadas;
import java.util.Scanner;

public class Listas_enlazadas {

    public static void main(String[] args) {
    
    Listas obj=new Listas();
    int opc;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la opcion a realizar");
    
    do{
        System.out.println("\n1- Insertar Nodo\n"
         + "2- Eliminar Nodo\n"
         + "3- Mostrar Nodo\n"
         + "4- Salir\n");
        opc = sc.nextInt();
        
        switch(opc){
            case 1:
            obj.InsertarNodo();
            break;
            
            case 2:
             obj.EliminarNodo();    
            break;
            
            case 3:
            System.out.println("Los nodos ingresados son: ");    
            obj.MostrarLista();
            break;
        }              
    }
    while(opc != 4);
    }
  }
    

