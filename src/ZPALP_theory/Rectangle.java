

public class Rectangle{
  public static void main (String[] args){

    int a = (int) Math.round(Math.random() * 4 + 1); // From 1 to 5
    int b = (int) Math.round(Math.random() * 4 + 1);

    System.out.print("Perimeter of rectangle (a=" + a + ",b=" + b + ") is ");
    System.out.println(2 * a + 2 * b);

    System.out.println("Area of rectangle is " + a * b);
    System.out.println("Diagonal of rectangle is " + Math.sqrt(a*a + b*b));

   

  }
}
