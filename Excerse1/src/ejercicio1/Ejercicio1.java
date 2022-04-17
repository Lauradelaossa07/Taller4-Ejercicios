/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner opc = new Scanner(System.in);
        int opcion;
        
         /**
         * Instanciamos la clase planeta, y haciendo uso del ArrayList alamcenara la informacion de los planetas.
         */
        List<Planets> universe = new ArrayList();

        //                                nombre, masa en kg, densidad en km3 ,diametro en km ,DistanciaSol en MKm
         //nombre,masa kg,densidad km3,diametro km,DistanciaSol MKm
        Planets planetMercury = new Planets("mercury",(float) 3.302, (float) 5.43,(float) 4879.4,(float) 57.91);
        Planets planetVenus =   new Planets("Venus",(float) 4.869,(float) 5.24,(float) 12103.6,(float) 108.2);
        Planets planetEarth =   new Planets("Earth",(float) 5.9736,(float) 1.08321,(float) 5.515,(float) 149.6);
        Planets planetMars =    new Planets("Mars",(float) 6.4185,(float) 3.9335,(float) 6794.4,(float) 227.9);
        Planets planetJupiter = new Planets("Jupiter",(float) 1.899,(float) 1336,(float) 142984,(float)778.5);
        Planets planetSaturn =  new Planets("Saturn",(float)5.688,(float) 690,(float) 12536,(float) 1.434);
        Planets planetUrano =   new Planets("Uranus",(float)8.686,(float) 1.274,(float) 51.118,(float) 2.871);
        Planets planetNeptune = new Planets("Neptune",(float)1.024,(float)1.64,(float)49.572,(float) 4.495);
        
        universe.add(planetMercury);
        universe.add(planetVenus);
        universe.add(planetEarth);
        universe.add(planetMars);
        universe.add(planetJupiter);
        universe.add(planetSaturn);
        universe.add(planetUrano);
        universe.add(planetNeptune);
        
/**
 * Realizamos el menú para que el usuario pueda escojer la consulta con los diferentes planetas
 */
        do
        {
            System.out.println("Select the option you want to consult: ");
            System.out.println("\n");
            System.out.println("1.mercury relative to the sun: ");
            System.out.println("2.Venus relative to the sun: ");
            System.out.println("3.Earth relative to the sun: ");
            System.out.println("4.Mars relative to the sun: ");
            System.out.println("5.Jupiter relative to the sun: ");
            System.out.println("6.Saturn relative to the sun: ");
            System.out.println("7.Uranus relative to the sun: ");
            System.out.println("8.Neptune relative to the sun: ");
            System.out.println("9.EXIT");
            
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                    float gravityM = (float) (6E-11*2E30*3.302/(57.91*2));
                     System.out.println("Result Mercury:"+gravityM);
                    break;
                case 2:
                    float gravityV = (float) (6E-11*2E30*4.869/(108.2*2));
                     System.out.println("Result Venus:"+gravityV);
                    break;
                case 3:
                     float gravityE = (float) (6E-11*2E30*5.9736/(149.6*2));
                     System.out.println("Result Earth:"+gravityE);
                    break;
                case 4:
                     float gravityMa = (float) (6E-11*2E30*6.4185/(227.9*2));
                     System.out.println("Result Mars:"+gravityMa);
                    break;
                case 5:
                     float gravityJ = (float) (6E-11*2E30*1.899/(778.5*2));
                     System.out.println("Result Jupiter:"+gravityJ);
                    break;
                case 6:
                     float gravityS = (float) (6E-11*2E30*5.688/(1.434*2));
                     System.out.println("Result Saturn:"+gravityS);
                    break;
                case 7:
                     float gravityU = (float) (6E-11*2E30*8.686/(2.871*2));
                     System.out.println("Result Uranus:"+gravityU);
                    break;
                case 8:
                     float gravityN = (float) (6E-11*2E30*1.024/(4.495*2));
                     System.out.println("Result Neptune:"+gravityN);
                    break;
            }
        }
        while(opcion !=9);
       
    }
    
}
