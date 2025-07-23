/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author PC 6
 */
public class Testapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String name;
        int birthyear;
        
       System.out.print("Enter your name: ");
       name = input.nextLine();
       
       System.out.print("Enter year of birth: ");
       birthyear = input.nextInt();
       
       System.out.println("hello"+name+", your age is "+(2025-birthyear));
      
    }
    
}
