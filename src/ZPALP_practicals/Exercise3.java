
package ZPALP_practicals;

/**
 * @author Pablo
 */
public class Exercise3 {
    public static void main(String[] args) {
        
        int dayWeek = (int)Math.round(Math.random()* 6 + 1);
        int dayMonth = (int)Math.round(Math.random()* 30 + 1);
        
        
        switch(dayWeek){
            case 1:
                System.out.println("Today is Monday, " + dayMonth);
                break;
            case 2:
                System.out.println("Today is Tuesday, " + dayMonth);
                break;
            case 3:
                System.out.println("Today is Wednesday, " + dayMonth);
                break;
            case 4:
                System.out.println("Today is Thursday, " + dayMonth);
                break;
            case 5:
                if(dayMonth == 13){
                System.out.println("Today is not a lucky day");
                }else{
                System.out.println("Today is Friday, " + dayMonth);
                }
                break;
            case 6:
                System.out.println("Today is Saturday, " + dayMonth);
                break;
            case 7:
                System.out.println("Today is Sunday, " + dayMonth);
                break;
            default:
                System.out.println("Error");
        }
        
        /*
            -- Code to test that day 31 is included
        
            int dayMonth;
            do {
                dayMonth = (int)Math.round(Math.random()* 30 + 1);
                System.out.println(dayMonth);
            } while (dayMonth != 31);
        */
        
        
    }
}
