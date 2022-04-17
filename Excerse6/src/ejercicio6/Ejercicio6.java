/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class Ejercicio6 {
    
    /**
     *  metodo OpenFile para Creacion del archivo
     * @param file 
     */
        public static void openFile(File file){
        try{
            System.out.println("You have entered two equal numbers");
            Desktop.getDesktop().open(file);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
         /** instanciamos el vector y se presenta la opción para ingresar el primer numero
         */
        Vector<String> number = new Vector();
        String num=JOptionPane.showInputDialog("Enter the number you want to enter");
        
        /**
         * compara los numeros imgresados y se detendra si valida que son repetidos secuencialmente.
         */
        while(!number.contains(num)){
            number.addElement(num);
            System.out.println("Number = "+number);
            num = JOptionPane.showInputDialog("Enter the number you want to enter");
        }
        
        /**
         * creación de los ficheros 
         */
        File file=new File("fichero.txt");
         try (PrintWriter writeNumbers = new PrintWriter(file)) {
            writeNumbers.write(number.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
        openFile(file);
    }
    
}
