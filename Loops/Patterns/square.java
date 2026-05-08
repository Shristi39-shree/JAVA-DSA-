package Loops.Patterns;

import java.util.Scanner;

public class square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dimension");
    int n = sc.nextInt();

    for(int i =0;i<n;i++){
      for(int j = 0;j<n;j++){
        System.out.print("* ");
      }
      System.out.print("\n");
    }

  }
}
