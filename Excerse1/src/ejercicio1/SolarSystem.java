/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Laura
 */
public abstract class SolarSystem {

    static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
     /**
     * declaramos los atributos que utilizaremos 
     */
    public String name;
    public float mass;
    public float density;
    public float diameter;
    public float distanceSun;

     /**
     * Constructor de la clase
     */
    public SolarSystem(String name, float mass, float density, float diameter, float distanceSun) {
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }
    
  
    /**
     * Inicializamos los atributos 
     */
        public SolarSystem(){
        name="";
        mass=0;
        density=0;
        diameter=0;
        distanceSun=0;
    }
    
    /**
     * Metodo abstracto para realizar los calculos correspondientes
     */
    public abstract float GravitationalAttraction(float mass,float Distance);

}
