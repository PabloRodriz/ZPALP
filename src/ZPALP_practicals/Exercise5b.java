package ZPALP_practicals;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Pablo
 */
public class Exercise5b {
    public static void main(String[] args) {
        
        int[] arrayOne = new int[4];
        // n = <20;40>
        int n = (int)Math.round(Math.random() * 20 + 20);
        System.out.println("n is : " + n);
        
        // lowerLimit = < -100; -50)
        int lowerLimit =new Random().nextInt(50) - 100;
        System.out.println("lowerLimit = " + lowerLimit);
        // upperLimit = < 200; 350)
        int upperLimit = (int)Math.round(Math.random() * 149 + 200);
        System.out.println("upperLimit = " + upperLimit);
        
        int[] arrayBig = new int[(upperLimit) - lowerLimit];
        System.out.println(arrayBig.length);
        for (int i = lowerLimit, j = 0; i < upperLimit ; i++) {
            arrayBig[j] += i;
            j++;
        }
        
        System.out.println(arrayBig[arrayBig.length - 1]);;
        
        for (int aux : arrayBig) {
            System.out.println(aux);
        }
    }
}
