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

/**
 * Creación de la clase Bike heredada de Vehicle
 */
public class Bike extends Vehicle{

    
    public String Name;
    public String color;
    public int Npassengers;
    private String crew;
    public int Nwheels;
    public String date;
    public int basket;

/**
 * Constructor
 * @param Name
 * @param color
 * @param Npassengers
 * @param crew
 * @param Nwheels
 * @param date
 * @param basket 
 */
    
    public Bike(String Name, String color, int Npassengers, String crew, int Nwheels, String date, int basket) {
        super(Name, color, Npassengers, crew, Nwheels, date);
        this.basket=basket;
    }

}

 
    

