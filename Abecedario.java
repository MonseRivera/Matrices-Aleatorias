
package abecedario;

import java.util.Scanner;

public class Abecedario {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tope=0, opt=0, cont=0;
        char caract;
        char[] pila = new char[26];
        do{
            System.out.println("\n"+ "1- llenar\n"+"2- eliminar\n"+"3- mostrar\n"+"4- repetidos\n"+"5- salir\n");
            switch (opt = sc.nextInt()){
                case 1:
                    for(int i = 0;1<26;i++){
                        if(tope<26){
                            
                    //Hacemos llamado de random si utilizarlo como metodo
                    //donde como limite tendra los 26 espacion iniciando con A hasta Z
                    
                            pila[tope]= (char) ((Math.random()*26)+ 'A');
                            tope++;
                        }else{
                            System.out.println("Atencion" + " " + "pila llena!");
                            break;
                        }
                    }
                    break;
                case 2:
                    if(tope > 0){
                        System.out.println("Atencion" + " " + "dato eliminado!" + " " +tope);
                        tope--;
                    } else {
                        System.out.println("Atencion" + " " + "no hay datos para eliminar...");
                    }
                    break;
                case 3:
                    if (tope > 0){
                        for(int i= tope - 1; i >= 0; i--){
                            System.out.print(" "+pila[i]);
                        }
                    } else {
                        System.out.println("Atencion" + " " + "pila vacia!");
                    }
                    break;
                case 4:
                    //iniciamos un ciclo for en donde iniciara en 0 y tendra un limite 
                    //que sera pila recorriendo los 26 espacios
                for(int i=0; i<pila.length; i++)
                {
                    //Con la variable "caract" tipo char almacenara lo que contenga pila
                    caract = pila[i];
                    
                    //Creamos otro ciclo for donde haremos la comparativa de donde recorre pila
                    //con nuestra variable caract que ya tiene almacenado
                for(int j=0; j<pila.length; j++){  
                    if(pila[j] == caract){
                        //Nuestro contador en 0 ira sumando 
                        cont++;
                    }
                    break;
                }
                System.out.print("La letra "+pila[i] + " " + "se repite "+ cont + "\n");
                cont=0;
                }
            }
        } while (opt !=5);
        
    }
    
}
