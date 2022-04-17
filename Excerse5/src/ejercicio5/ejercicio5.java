/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Laura
 */
import ejercicio5.Vehicle;
import java.io.*; //importar
import java.io.InputStreamReader;

/**
 *
 * @author Laura
 */
public class ejercicio5 {
    
     //Declaracion de Arreglo
    static Vehicle vehicles[] = null;
    static Bike bikes[]=null;

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
            System.out.println("2.-Enter Bike");
            System.out.println("3.-Enter Plane");
            System.out.println("4.-Enter Train");
            System.out.println("5.-List Vehicles");
            System.out.println("6.-Exit");
            System.out.print("Select an option: ");
            opcion = Integer.parseInt(lector.readLine());//capturamos lo ingresado

            switch (opcion) {
                case 1:
                    AddFerry();
                    break;
                 case 2:
                     AddBike();
                    break;    
                case 3:
                     AddPlane();
                    break; 
                  case 4:
                     AddTrain();
                    break; 
                case 5:
                    ListVehicles();
                    break;
                case 6:
                    System.out.println("leave...");
            }
        } while (opcion != 4);
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
        vehicles[cont] = new Vehicle(Name, color, Npassengers, crew, Nwheels, date) {};
        cont++;
        System.out.println("Ferry added: " + cont);
    }
    
     private static void AddBike() throws IOException {

        //variables locales
        String Name = "";
        String color = "";
        int Npassengers = 0;
        String crew = "";
        int Nwheels = 0;
        String date = "";
        int basket= 0;

        //Lectura de datos:
        System.out.println("\n");
        System.out.println("--------------------");
        System.out.println("BIKE DATA");
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
        
        System.out.print("Number of basket : ");
        basket = Integer.parseInt (lector.readLine());


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

        //Agregar elementos a la coleccion bike:
        vehicles[cont] = new Bike(Name, color, Npassengers, crew, Nwheels, date, basket) {};
        cont++;
        System.out.println("Bike added: " + cont);
    }
     
        private static void AddPlane() throws IOException {

        //variables locales
        String Name = "";
        String color = "";
        int Npassengers = 0;
        String crew = "";
        int Nwheels = 0;
        String date = "";
        int basket= 0;
        int Nwindows=0;

        //Lectura de datos:
        System.out.println("\n");
        System.out.println("--------------------");
        System.out.println("PLANE DATA");
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
        
        System.out.print("Number of windows : ");
        Nwindows = Integer.parseInt (lector.readLine());


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

        //Agregar elementos a la coleccion plane:
        vehicles[cont] = new Plane(Name, color, Npassengers, crew, Nwheels, date, Nwindows) {};
        cont++;
        System.out.println("Plane added: " + cont);
    }
    
        private static void AddTrain() throws IOException {

        //variables locales
        String Name = "";
        String color = "";
        int Npassengers = 0;
        String crew = "";
        int Nwheels = 0;
        String date = "";
        double weight=0;

        //Lectura de datos:
        System.out.println("\n");
        System.out.println("--------------------");
        System.out.println("PLANE DATA");
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
        
        System.out.print("weight : ");
        weight = Double.parseDouble(lector.readLine());


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

        //Agregar elementos a la coleccion plane:
        vehicles[cont] = new Train(Name, color, Npassengers, crew, Nwheels, date, weight) {};
        cont++;
        System.out.println("Train added: " + cont);

    }  

    private static void ListVehicles() {
               for (int i = 0; i < cont; i++) {
            System.out.println("\n VEHICLES- REGISTRADOS-");
            System.out.println("" + vehicles[i].toString());
        }
    }
        
}


