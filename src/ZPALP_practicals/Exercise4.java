/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_practicals;

import java.util.Scanner;

/**
 * @author Pablo
 */
public class Exercise4 {
        
        
    public static void main(String[] args) {
        
        final int cartMaxWeight = 200;
        final int boxWeight = 30;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Number of boxes to unload? : ");
        int boxesToUnload = scan.nextInt();
        
        Cart transPortCart = new Cart(0,0);
       
        while(boxesToUnload > 0) {
            if(transPortCart.numberOfBoxes == (int) (cartMaxWeight / boxWeight)) {
                System.out.println("Cart FULL, unloading cart.....");
                transPortCart.weight = 0;
                transPortCart.numberOfBoxes = 0;
                transPortCart.cartStatus();
                
            }else{               
                transPortCart.unloadBox();
                boxesToUnload--;
                System.out.println("Boxes left in truck: " + boxesToUnload);
                if(boxesToUnload == 0){
                    System.out.println("TRUCK UNLOADED");
                }
            }
        }
        
       

    }
}

class Cart{
    
    int numberOfBoxes;
    int weight;
    
    public Cart(int nBoxes, int weight){
        
        this.numberOfBoxes = nBoxes;
        this.weight = weight;
    }
    
    
    public void cartStatus(){
        System.out.print("Boxes in cart: "  + this.numberOfBoxes);
        System.out.println(" Weight of cart: "  + this.weight);
}

    void unloadBox() {
        this.numberOfBoxes++;
        this.weight += 30;
        System.out.println("Box unloaded from truck, and loaded to cart");
        cartStatus();
    }
}

/*
// If the total weight to be unloaded, is smaller or equal to maxWeight of car
        if(boxesToUnload * boxWeight <= cartMaxWeight ){ 
            transPortCart.numberOfBoxes = boxesToUnload;
            transPortCart.weight = boxesToUnload * boxWeight;
            boxesToUnload = 0;

        } else{
            transPortCart.numberOfBoxes = cartMaxWeight / boxWeight;
            transPortCart.weight = boxesToUnload * boxWeight;
        }
            transPortCart.cartStatus();

*/