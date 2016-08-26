/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Random;
/**
 *
 * @author Rocio
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a, b, c , d ,e ;
            Random rnd = new Random();
            a = (rnd.nextFloat() * 10);
            b = (rnd.nextFloat() * 10);
            c = (rnd.nextFloat() * 10);
            d = (rnd.nextFloat() * 10);
            e = (rnd.nextFloat() * 10);
            
            System.out.println(a);        
            System.out.println(b);        
            System.out.println(c);    
            System.out.println(d); 
            System.out.println(e); 
      }
} 
    
    

