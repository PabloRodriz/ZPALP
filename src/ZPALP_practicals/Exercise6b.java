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
    
    static char [][] map;
    static ShipPosition[] shipsPositions = new ShipPosition[4];
    static int ASCIIletter = 65;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This is the battleship game,");
        System.out.println("these are the boats available:");
        System.out.println("Dreadnought: (4x1) ----");
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
        
        int random; 
           
        //printField(map);
        for (int i = 0; i < shipsPositions.length; i++) {
            
            random = (int)Math.round(Math.random()* (1 - 0) + 0);
            ShipPosition helpObject = generateFinalPosition(generatePosition(4,sizeOfMap), sizeOfMap, random);
            if(contains(shipsPositions,helpObject)){
                
            }
            shipsPositions[i] = generateFinalPosition(generatePosition(4,sizeOfMap), sizeOfMap, random);
        }
       
       
       System.out.println(shipsPositions[0].toString());
       
       
        
    }
    
    public static int [] generatePosition(int sizeOfShip, int sizeOfField){
     
        int x = (int)Math.round(Math.random()* (sizeOfField - 1) + 1);
        int y = sizeOfShip + x;
        
        if(y > sizeOfField + 1){
            return generatePosition(sizeOfShip, sizeOfField);
        }else{
            int [] position = {x,y -1 };
            return position;
        }
    
    }
    
    public static ShipPosition generateFinalPosition(int [] coord, int sizeOfField, int orientation){
        int helpV = (int)Math.round(Math.random()* (sizeOfField - 1) + 1);
        
        if(orientation == 0){
            return new ShipPosition(helpV,coord[0],helpV,coord[1]); 
        }else{
            
        }
        return new ShipPosition(coord[0],helpV,coord[1], helpV);
        
    }
    
    public static void generateField(int sizeOfMap) {
        // generate and print
        map = new char[sizeOfMap + 1][sizeOfMap + 1];
        for (int i = 0; i < sizeOfMap + 1; i++) {
            for (int j = 0; j < sizeOfMap + 1; j++) {
                if(j==0){
                    map[i][j]= (char)(48 + i);
                }else if(i==0 && j!= 0){
                    map[i][j]= (char)(65 + j - 1);
                }
                else{
                    map[i][j]= '·';
                }
            }            
        }
    }
    
    public static void printField(char [][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
    
    
    
    
    public static String getLetter(int numberASCII){
        int letter = numberASCII;
        char hV = (char)(letter);
        return String.valueOf(hV);
    }

    private static boolean contains(ShipPosition[] shipsPositions, ShipPosition helpObject) {
        
        boolean result = false;
        for (ShipPosition shipsPosition : shipsPositions) {
            if(shipsPosition.equals(helpObject)){
                result = true;
                break;
            }
        }
        return result;
    }

    
    
}

class ShipPosition{
    
    int x1,y1,x2,y2;
    
    public ShipPosition(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "ShipPosition{" + "x1= " + x1 + ", y1= " + y1 + ", x2= " + x2 + ", y2= " + y2 + '}';
    }
    
    
}
