
package listas_enlazadas;
import java.util.Scanner;

public class Listas_enlazadas {

    //Cada vez que se cree un nuevo objeto de la clase "Node" 
    //estaremos creando un nuevo Nodo
    static class Node {
        String name; //Tipo de dato
        Node next;   //Puntero que contendrá la dirección del sig Nodo
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;  
        
        top = new Node();
        System.out.println("1- Ingresa el nodo inicial");
        top.name = sc.nextLine() + (" |");
        top.next = null;
        
        dump(" ",top);
        Node temp;

        temp = new Node();
        System.out.println("2- Ingresa el nodo detras del inicial");
        temp.name = sc.nextLine() + (" |");
        temp.next = top;
        top = temp;

        dump("\n", top);

        temp = new Node();
        System.out.println("3- Ingresa el nodo delante del inicial");
        temp.name = sc.nextLine() + (" |");
        temp.next = null;
        
        Node temp2;
        temp2 = top;

        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp;
        dump("\n", top);

        temp = new Node();
        System.out.println("4- Ingresa el nodo intermedio");
        System.out.println("¿Entre que nodo se va a ingresar?");
        temp.name = sc.nextLine() + (" |");
        
        temp2 = top;

        while (temp2.name.equals(top.name) == false) {
            temp2 = temp2.next;
        }

        temp.next = temp2.next;
        temp2.next = temp;

        dump("Lista mostrada\n", top);
    }

    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");

        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }
    }
    

