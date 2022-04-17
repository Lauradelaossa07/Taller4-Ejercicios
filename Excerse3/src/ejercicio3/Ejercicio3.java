/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    

    /**
     * Metodo que permite desestructurar el arreglo
     * @param P contiene el arreglo 
     * @param left contiene el numero en la primera posicion
     * @param right contiene el numero en la ultima posicion
     */
  public static void quicksort(int P[], int left, int right) {

  int pivot=P[(left+right)/2];    // se toma el primer elemento como pivote o arranque
  int i=left;                     // i realiza la búsqueda de izquierda a derecha
  int j=right;                    // j realiza la búsqueda de derecha a izquierda
  int aux;
  
  do{
            while(P[i] < pivot){
                i++;
            }
            while(P[j] > pivot){
                j--;
            }

            if (i <= j) {
                aux = P[i];
                P[i] = P[j];
                P[j] = aux;
                i++;
                j--;
            }
        }
            while(i <= j);
            
            if (left < j ) {
                quicksort(P, left, j);
            }
            else if (i < right) {
                quicksort(P, i, right);
            }
            else{
               for (int k = 0; k < P.length; k++){
                   System.out.println("numero ordenado por QuickSort: " + P[k]);
               } 
            } 
   
}
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
         // TODO code application logic here
        /**
        * Creación del  arreglo y los atributos, utilizaremos el cilo do while
        * para mostrar el menú, con el cual el usuario escojera la consulta deseada.
        */
        int integers[]=new int[15];
        int aux; 
        int opcion;
         do
        {
            System.out.println("choose an option: ");
            System.out.println("\n");
            System.out.println("1.array creation: ");
            System.out.println("2.Sort by QuickSort method: ");
            System.out.println("3.Sort by Bubble method: ");
            System.out.println("4.Exit: ");
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                    for(int i = 0;i<=14;i++){
                    integers[i]=(int)(Math.random()*100+1);
                    System.out.println("Arreglo: "+i+" ---> "+integers[i]);
                    }
                    break;  
                case 2:
                    quicksort(integers, 0, integers.length-1);
                    break;
                case 3:
                       for(int i = 0; i<10-1;i++){
                        for(int j=0;j<10-1;j++){
                            if(integers[j]>integers[j+1]){
                                aux=integers[j];
                                integers[j]= integers[j+1];
                                integers[j+1]=aux;
                            }
                        }
                    }
                    
                    for(int i = 0;i<10;i++){
                        System.out.println("Se a ordenado con el metodo burbuja: "+integers[i]);
                    }
                    break;
            }
        }
        while(opcion !=4);

    }
}
    

