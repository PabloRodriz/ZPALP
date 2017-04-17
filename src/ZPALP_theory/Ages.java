
package ZPALP_theory;

/**
 * @author Pablo
 */
public class Ages {
    public static void main(String[] args) {
        
        int age = (int) Math.round(Math.random() * 100);
        
        System.out.println(age);
        if(age < 15){
            System.out.println("Child");
        } else if(age < 18){
            System.out.println("Teenager");
        } else if(age < 70){
            System.out.println("adult");
        }else{
            System.out.println("senior");
        }
        
        
    }
}
