package Loops.Patterns;

import java.util.Scanner;

public class triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows ");
    int n = sc.nextInt();
  
    for(int i = 0;i<n;i++){
      for(int j = 0;j<i+1;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
