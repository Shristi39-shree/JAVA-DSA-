
import java.util.Scanner;

public class Circumference {
  public static double Circum(int r){
    double C = 2*(3.14)*r;
    return C;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter the radius of the circle");
    int r= sc.nextInt();
    double CC = Circum(r);
    System.out.println("The circumference of the circle:"+ CC);
  }
}
