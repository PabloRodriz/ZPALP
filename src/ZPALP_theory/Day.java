package ZPALP_theory;

/**
 * @author Pablo
 */
public class Day {
    public static void main(String[] args) {
        int dayNumber = (int)Math.round(Math.random()* 6 + 1);
        System.out.println(dayNumber);
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }
}
