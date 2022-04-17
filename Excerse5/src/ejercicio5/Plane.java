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
 * Creación de la clase Plane heredada de Vehicle
 */
public class Plane extends Vehicle{
    
    public String Name;
    public String color;
    public int Npassengers;
    private String crew;
    public int Nwheels;
    public String date;
    public int Nwindows;
    
/**
 * Constructor
 * @param Name
 * @param color
 * @param Npassengers
 * @param crew
 * @param Nwheels
 * @param date
 * @param Nwindows 
 */
    public Plane(String Name, String color, int Npassengers, String crew, int Nwheels, String date, int Nwindows) {
        super(Name, color, Npassengers, crew, Nwheels, date);
        this.Nwindows=0;
    }
    
}
