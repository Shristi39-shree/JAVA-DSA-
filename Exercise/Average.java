
import java.util.*;
public class Average {
  public static int calculateAvg(int a,int b,int c){
    int avg = (a+b+c)/3;
   
    System.out.println(avg);
     return avg;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the 1st number");
    int a = sc.nextInt();

    System.out.println("Enter the 2nd number");
    int b = sc.nextInt();

    System.out.println("Enter the 3rd number");
    int c = sc.nextInt();

    calculateAvg(a, b, c);
  }
}
