package Conditional;
import java.util.Scanner;

public class else_if {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a%b==0){
      System.err.println("Is divisible");
    }
    else if(a%b != 0){
      System.out.println("Not Divisible");
    }
    else{
      System.out.println("Give valid input");
    }
  }
}
