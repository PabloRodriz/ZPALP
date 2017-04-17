package ZPALP_theory;

/**
 * @author Pablo
 */
public class Example2 {
    
    public static void main(String[] args) {
        // interval <a;b> 
        // a = <10;99>
        int a = (int)Math.round(Math.random() * 89 + 10);
        
        // b = <100; 199>
        int b = (int)Math.round(Math.random() * 99 + 100 );
        
        // <a;b>
        int gen = (int)Math.round(Math.random() * (b-a)*3 + a);
        
        if((a < gen) && (gen < b)){
            System.out.println("Number " + gen + " is in " + "< " + a + "; " + b + " >");
        } else{
            //System.out.println("Number " + gen + " is in " + "< " + a + "; " + b + " >");
            System.out.printf("Number %d is NOT in <%d;%d>. \n", gen, a ,b);
        }
    }
}
