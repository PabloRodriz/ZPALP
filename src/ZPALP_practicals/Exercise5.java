/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_practicals;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Pablo
 */
public class Exercise5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("0 - Exit the program");
        System.out.println("1 - Print the date");
        System.out.println("2 - List system properties");
        
        
        do {
            int input = scan.nextInt();
           if(input == 0){
               System.out.println("Exitting the program");
               break;
           } else if(input == 1){
               Date date = new Date();   
               System.out.print("Current date: ");
               System.out.println(date.toString());
           } else if(input == 2) {
               System.getProperties().list(System.out);
           } else{
               System.out.println("Incorrect input, try again");
           }
            
        } while (true);
        
        
    }
 
}
