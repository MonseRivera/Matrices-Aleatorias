
package listas_enlazadas;
import java.util.Scanner;

public class Listas_enlazadas {

    public static void main(String[] args) {
    
    Listas obj=new Listas();
    int opc;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la opcion a realizar");
    
    do{
        System.out.println("\n1- Insertar nodo\n"
         + "2- Insertar nodo atras del inicial\n"
         + "3- Insertar nodo delante del incial\n"
         + "4- Insertar nodo intermedio\n"        
         + "5- Buscar nodo\n"
         + "6- Eliminar nodo\n"       
         + "7- Mostrar lista\n"
         + "8- Generar una palabra\n"       
         + "9- Salir\n");
        opc = sc.nextInt();
        
        switch(opc){
            case 1:
            obj.InsertarNodo();
            break;
            
            case 2:
            obj.NodoAtras();
            break;
            
            case 3:
            obj.NodoAdelt();
            break;
            
            case 4:
            obj.NodoInter();    
            break;
            
            case 5:
            obj.BuscarNodo();
            break;
            
            case 6:
            obj.EliminarNodo(); 
            break;
                
            case 7:
            System.out.println("Los nodos ingresados son: ");    
            obj.MostrarLista();
            break;
            
            case 8:
            obj.GenerPalabra();
            break;
        }              
    }
    while(opc != 9);
    }
  }
    

