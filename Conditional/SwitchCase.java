package Conditional;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.err.println("Enter one number");
    int a = sc.nextInt();

    switch (a%2) {
      case 0:
        
          System.out.println("Even number");
        
        break;

        case 1:
        
          System.out.println("Odd number");
        
        break;
    
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
