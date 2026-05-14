package Loops.Patterns;

import java.util.Scanner;

public class FloydTriangle {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the deimensio if the triangle");
    int n = sc.nextInt();
    int num = 1;
    for(int i =1; i<n;i++){
      for(int j=1;j<i+1;j++){
         System.out.print(num + " ");
         num++;
         
      }
      System.out.println();
    }
  }
}
