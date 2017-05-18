/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_practicals;

import java.util.Scanner;

/** 
 * Playing with arrays
 * Swapping numbers above and below main diagonal of a matrix
 * 
 * @author Pablo
 */
public class Exercise6 {
    public static void main(String[] args) {
        // <10, 50)
        int number = (int)Math.round(Math.random() * 39 + 10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of matrix: ");
        int size = scan.nextInt();
        
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)Math.round(Math.random() * 39 + 10);
            }
        }
        
        printArray(matrix);
        System.out.println("");
        printArray(swapDiagonal(matrix, size));
        System.out.println("");
        printArray(zeros(matrix));
        
    }

    
    public static void printArray(int[][] arrayToString) {
        for (int i = 0; i < arrayToString.length; i++) {
            for (int j = 0; j < arrayToString[i].length; j++) {
                System.out.print(arrayToString[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static int [][]  swapDiagonal(int [][] array, int size){
        int[][] aux = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                aux[i][j] = array[j][i];
            }
        }
        return aux;
    }
    
    public static int [][]  zeros(int [][] array){
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i>j){
                  array[i][j] = 0; 
                }
                
            }
        }
        return array;
    }
    
    
}
