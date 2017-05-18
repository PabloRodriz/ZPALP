/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_theory;

/**
 * @author Pablo
 */

// --- Sorting arrays ----

public class Sort {
    
    private int[] array;
    
    public static void main(String[] args) {
        Sort test = new Sort(10);
        test.generateArray(10, 50);
        
        test.printArray();
        //test.selectionSort();
        //test.printArray();
        test.bubbleSort();
        test.printArray();
    }
    /**
     * Constructor
     * 
     * @param arraySize 
     */
    public Sort(int arraySize){
        array = new int[arraySize];
    }
    
    /**
     * Method for generating elements in array from a given interval
     * 
     * @param lowerBound
     * @param upperBound 
     */
    public void generateArray(int lowerBound, int upperBound){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)Math.round(Math.random() * (upperBound - lowerBound) + lowerBound);
        }
    }
    
    public void printArray(){
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
    
    public void selectionSort(){
        for (int i = 0; i < array.length - 1; i++) {
            int minimalValue = array[i]; // Element with minimal value in unsorted part
            int indexMinimal = i; // Index of element with min value
            
            // Searching for minimal value in unsorted part
            // Starting at i + 1 
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < minimalValue){
                    minimalValue = array[j];
                    indexMinimal = j;
                }
            }
            // Swapping of minimal value with element at index i. At index i is
            //  first element of unsorted part of the array
            array[indexMinimal] = array[i];
            array[i] = minimalValue;
            
        }
    }
    
    public void bubbleSort(){
        int aux;
        boolean isSorted = false;
        while(!isSorted){
            for (int i = 0; i < array.length - 1; i++) {
                
                    if(array[i] > array[i+1]){
                        aux = array[i+1];
                        array[i+1] = array[i];
                        array[i] = aux;
                        isSorted = false; // not sorted
                    }else{
                        isSorted = true;
                    }
                
            }
        }
    }
    
}
