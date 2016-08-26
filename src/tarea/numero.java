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
public class numero {
    
    public static void main(String[] args) {
            int a, b, c;
            Random rnd = new Random();
            a = (rnd.nextInt(26) + 65);
            b = (rnd.nextInt(26) + 65);
            c = (rnd.nextInt(26) + 65);
            System.out.println(a);        
            System.out.println(b);        
            System.out.println(c);  
        // TODO code application logic here
    }
    
}

    
