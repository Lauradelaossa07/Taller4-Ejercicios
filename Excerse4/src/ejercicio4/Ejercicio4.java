/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.Vehicle;
import java.io.*; //importar
import java.io.InputStreamReader;

/**
 *
 * @author Laura
 */
public class Ejercicio4 {
    
     //Declaracion de Arreglo
    static Vehicle vehicles[] = null;

    //Contador
    static int cont = 0;

    //Lectura y captura del teclado reemplaza a la funcion Scanner
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader lector = new BufferedReader(isr);


    public static void main(String[] args) throws IOException {
        
         //Inicializar arreglo
        vehicles = new Vehicle[10];

        //inicializar opcion
        int opcion = 0;

        //Menu
        do {
            System.out.println("CONTROL MENU");
            System.out.println("----------------");
            System.out.println("1.-Enter Ferry");
            System.out.println("2.-List Ferry");
            System.out.println("3.-Exit");
            System.out.print("Select an option: ");
            opcion = Integer.parseInt(lector.readLine());//capturamos lo ingresado

            switch (opcion) {
                case 1:
                    AddFerry();
                    break;
                case 2:
                    ListFerry();
                    break;
                case 3:
                    System.out.println("leave...");
            }
        } while (opcion != 3);
        System.exit(0);
    }

    //Metodo crear alumno
    private static void AddFerry() throws IOException {

        //variables locales
        String Name = "";
        String color = "";
        int Npassengers = 0;
        String crew = "";
        int Nwheels = 0;
        String date = "";

        //Lectura de datos:
        System.out.println("\n");
        System.out.println("--------------------");
        System.out.println("FERRY DATA");
        System.out.println("--------------------");

        System.out.print("Name: ");
        Name = lector.readLine();

        System.out.print("Color: ");
        color = lector.readLine();

        System.out.print("Number of passengers: ");
        Npassengers = Integer.parseInt (lector.readLine());//se convierte el dato de string a int

        System.out.print("Number of wheels: ");
        Nwheels = Integer.parseInt (lector.readLine());
        
        System.out.print("Date: ");
        date = lector.readLine();


        //MUESTRA DE DATOS:
        System.out.print("Manned: ");

        //CONDICIONES:
        if (Npassengers > 0) {
            crew = "Yes";
            System.out.println(crew);
        } else {
            crew = "No";
            System.out.println(crew);
        }

        //Agregar elementos a la coleccion:
        vehicles[cont] = new Vehicle(Name, color, Npassengers, crew, Nwheels, date);
        cont++;
        System.out.println("Ferry added: " + cont);
    }

    //Metodo listar ferry
    private static void ListFerry() {
        for (int i = 0; i < cont; i++) {
            System.out.println("\n--REGISTERED FERRYS:--");
            System.out.println("" + vehicles[i].toString());
        }
        
    }
    
}
