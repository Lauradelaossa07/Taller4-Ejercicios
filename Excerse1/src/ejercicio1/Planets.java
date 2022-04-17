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

/**
 * Declaramos la clase Planets como una herencia de SolarSystem
 * 
 */
public class Planets extends SolarSystem{
 
 /**
  * declaramos las constantes correspondientes G= constante de gravitación universal de Newton
  * massSun= Masa sel sol 
  */   
    private double G=6E-11;
    public double massSun = 2E30;

   

    Planets(String name, float mass, float density, float diameter, float distanceSun) {
       super(name, mass, density, diameter, distanceSun);
    }


 /**
 * Metodo que nos permite calcular la atracción gravitatoria entre dos cuerpos del sistema usando los parametros
 * @param mass 
 * @param Distance
 * @return Result seria el resultado
 */
    
    @Override
    public float GravitationalAttraction( float mass, float Distance) {
         float Result = (float) (G*(mass * massSun )/Distance*2);
          return Result;
    }

   

}
