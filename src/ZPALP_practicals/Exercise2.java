package ZPALP_practicals;

public class Exercise2{
  public static void main(String[] args) {

    int h = (int) Math.round(Math.random() * 14 + 1);
    int r = (int) Math.round(Math.random() * 14 + 1);

    System.out.print("Surface of Cylinder (h=" + h + ",r=" + r + ") is ");
    System.out.println(2 * Math.PI * r * ( r + h));

    System.out.println("Volume of Cylinder is " + Math.PI * (r * r ) * h);

  }
}
