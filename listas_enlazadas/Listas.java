package listas_enlazadas;
import java.util.Scanner;

public class Listas {
    Nodo inicio = new Nodo();
    Nodo fin = new Nodo();
    Scanner sc = new Scanner(System.in);
   
    //Lista simple: 12 | 15 | 13 | null
    public Listas (){
    inicio = null;
    fin = null;
}
    
    public void InsertarNodo (){
        Nodo top = new Nodo();
        System.out.print("Ingrese el dato para el nodo: ");
        top.dato = sc.nextInt();
        
        if(inicio == null){
            inicio = top;
            inicio.sig = null;
            fin = top;
        }else{
            fin.sig = top;
            top.sig = null;
            fin = top;
        }
    }
    
    public void BuscarNodo(){
        Nodo actual = new Nodo();
        actual = inicio;
        boolean encontrado = false;
        
        System.out.print("Ingrese el dato del Nodo a buscar: ");
        int nodoBuscado = sc.nextInt();
        
        if(inicio != null){
            while(actual != null && encontrado != true){
            if(actual.dato == nodoBuscado){
            System.out.println("\n El Nodo con el dato " + actual.dato + " encontrado! \n");    
                encontrado = true;
            }    
                System.out.print(" | " + actual.dato );
                actual = actual.sig;
            }
            if(!encontrado){
            System.out.println("\n El dato no existe! \n");
        }
        }else{
            System.out.println("\n La lista esta vacia\n");
        }
    }
    
    public void EliminarNodo (){
    
        Nodo actual = new Nodo();
        actual = inicio;
        Nodo ant = new Nodo();
        ant = null;
        
        boolean encontrado = false;
        System.out.print(" Ingrese el dato del nodo a eliminar: ");
        int nodoBuscado = sc.nextInt();
        
        if(inicio != null){
            while(actual != null && encontrado != true){
                if(actual.dato == nodoBuscado){
                
                    if(actual == inicio){
                        inicio = inicio.sig;
                    
                    }else if(actual == fin){
                        ant.sig = null;
                        fin = ant;
                    }else{        
                        ant.sig = actual.sig;
                    }
                    System.out.print("\n Nodo eliminado\n");
                    encontrado = true;
                }
            ant = actual;
            actual = actual.sig;
        }
        
        if(!encontrado){
            System.out.println("\n Nodo no localizado!\n");
        }
    }else{
            System.out.println("\n La lista se encuentra vacia...\n");
        }
}
    
    public void NodoAtras(){
        Nodo temp;
        temp = new Nodo();
        System.out.print("Ingrese el dato para el nodo: ");
        temp.dato = sc.nextInt();
        temp.sig = inicio;
        inicio = temp;
    }
    
    public void NodoAdelt (){
        Nodo temp;
        temp = new Nodo();
        System.out.print("Ingrese el dato para el nodo: ");
        temp.dato = sc.nextInt();
        temp.sig = null;
        
        Nodo temp2;
        temp2 = inicio;
        
        while(temp2.sig != null){
            temp2 = temp2.sig;
        }
        temp2.sig = temp;
    }
    
    public void NodoInter(){
        Nodo actual = new Nodo();
        actual = inicio;
        boolean encontrado = false;
        
        System.out.print("Ingrese el Nodo de referencia: ");
        int nodoBuscado = sc.nextInt();
        
        if(inicio != null){
            while(actual != null && encontrado != true){
            if(actual.dato == nodoBuscado){ 
                encontrado = true;
                
                Nodo temp;
            temp = new Nodo();
            System.out.print("Ingrese el dato para el nodo: ");
            temp.dato = sc.nextInt();
                Nodo temp2;
            temp2 = inicio;
            temp.sig = temp2.sig;
            temp2.sig = temp;      
            }    
            }
            if(!encontrado){
            System.out.println("\n El dato no existe! \n");
        }
        }else{
            System.out.println("\n La lista esta vacia\n");
        }   
    }
    
    public void MostrarLista(){
        //Le pedimos que inicie desde el principio 
        //Definiendo como "actual" a la posicion dentro de la lista
        Nodo actual = new Nodo();
        actual = inicio;
        
        if(inicio != null){
            //Teniendo como condicion hasta que el dato sea "null" se detendra de imprimir los datos
            while(actual != null){
                System.out.print(" | " + actual.dato );
                actual = actual.sig;
            }
        }else{
            System.out.println("\n La lista esta vacia\n");
        }
        
    }
    
    public void GenerPalabra(){        
    }
}                                                                                   
