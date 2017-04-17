/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_practicals;

/** 
 * @author Pablo
 * 
 * Swapping numbers above and below main diagonal of a matrix
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
       
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;

        nums[1][0] = 5;
        nums[1][1] = 6;
        nums[1][2] = 7;
        nums[1][3] = 8;

        nums[2][0] = 9;
        nums[2][1] = 10;
        nums[2][2] = 11;
        nums[2][3] = 12;

        nums[3][0] = 13;
        nums[3][1] = 14;
        nums[3][2] = 15;
        nums[3][3] = 16;
        
        printArray(nums);
    }

    
    public static void printArray(int[][] arrayToString) {
        for (int i = 0; i < arrayToString.length; i++) {
            for (int j = 0; j < arrayToString[i].length; j++) {
                System.out.print(arrayToString[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    
}
