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
 * Creación de la clase Train heredada de Vehicle
 */
public class Train extends Vehicle{

    public String Name;
    public String color;
    public int Npassengers;
    private String crew;
    public int Nwheels;
    public String date;
    public double weight;

/**
 * Constructor
 * @param Name
 * @param color
 * @param Npassengers
 * @param crew
 * @param Nwheels
 * @param date
 * @param weight 
 */
    public Train(String Name, String color, int Npassengers, String crew, int Nwheels, String date, double weight) {
        super(Name, color, Npassengers, crew, Nwheels, date);
        this.weight=0;
    }
    
}
