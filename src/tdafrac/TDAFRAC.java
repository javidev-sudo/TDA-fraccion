/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdafrac;
import Negocio.Fraccion;

/**
 *
 * @author javi24
 */
public class TDAFRAC {

    
        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion(3,4,'+');
        Fraccion f2 = new Fraccion(5,4,'+');
        Fraccion c = new Fraccion();
        
        //f1.simplificar();
        c.Suma(f1,f2);
        System.out.println(c.toString());
        c.Resta(f1, f2);
        System.out.println(c.toString());
        c.Division(f1, f2);
        System.out.println(c.toString());
        c.Multiplicacion(f1, f2);
        System.out.println(c.toString());
        
        
        
        
        
    }
    
}
