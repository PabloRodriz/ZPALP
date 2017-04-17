/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_practicals;

import java.util.Scanner;

/**
 * @author Pablo
 * 
 * Battleship game
 */
public class Exercise6b {
    
    static int [][] map;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This is the battleship game,");
        System.out.println("this are the boats available:");
        System.out.println("Dreadnought: (5x1) -----");
        System.out.println("Cruiser[2 units] (3x1) ---");
        System.out.println("Submarine (2x1) --");
        System.out.println("");
        
        int sizeOfMap = 0;
        
        while (sizeOfMap <= 5) {            
            System.out.print("Choose field size (at least 5): ");
            sizeOfMap = scan.nextInt();
            if(sizeOfMap < 5){
                System.out.println("Incorrect size!!");
            }else{
                generateField(sizeOfMap);
                break;
            }
        }
        
       // Set positions for ships 
        
    }

    public static void generateField(int sizeOfMap) {
        // generate and print
        map = new int[sizeOfMap][sizeOfMap];
        for (int i = 0; i < sizeOfMap + 2; i++) {
            for (int j = 0; j < sizeOfMap + 2; j++) {
                
                System.out.print("· ");
              
            }
            System.out.println("");
        }
    }
}
