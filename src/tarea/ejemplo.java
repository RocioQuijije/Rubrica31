/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Rocio
 */
public class ejemplo {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase;
       System.out.print("Introduce una frase: ");
       frase = sc.nextLine();
       StringTokenizer st = new StringTokenizer(frase);
       System.out.println("Número de palabras: " + st.countTokens());
    }
}

    
 
    

