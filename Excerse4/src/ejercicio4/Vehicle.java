/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;


/**
 *
 * @author Laura
 */

/**
 * Creación de la clase Vehicle
 */
public class Vehicle {
/**
 * Declaración de atributos de la clase 
 */    
    public String Name;
    public String color;
    public int Npassengers;
    private String crew;
    public int Nwheels;
    public String date;
    
/**
 * Metodo Constructor 
 * @param Name
 * @param color
 * @param Npassengers
 * @param crew
 * @param Nwheels
 * @param date 
 */    

    public Vehicle(String Name, String color, int Npassengers, String crew, int Nwheels, String date) {
        this.Name = Name;
        this.color = color;
        this.Npassengers = Npassengers;
        this.crew = crew;
        this.Nwheels = Nwheels;
        this.date = date;
    }

/**
 * Metodos get y set de los atributos 
 * @return 
 */
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengers() {
        return Npassengers;
    }

    public void setPassengers(int passengers) {
        this.Npassengers = passengers;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public int getWheels() {
        return Nwheels;
    }

    public void setWheels(int wheels) {
        this.Nwheels = wheels;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void isCrew(int Npassengers) {
        if (Npassengers > 0) {
            crew = "Tripulado" ;
        } else {
            crew = "NO Tripulado" ;
        }
}
/**
 * Metodo ToString para la muestra de los datos al usuario
 * @return los atributos del vehiculo agregado
 */
    @Override
    public String toString() {
        return "Vehicle:" 
                + "\nName=" + Name 
                + "\ncolor=" + color 
                + "\nNpassengers=" + Npassengers 
                + "\ncrew=" + crew 
                + "\nNwheels=" + Nwheels 
                + "\ndate=" + date;
    }
    

}
