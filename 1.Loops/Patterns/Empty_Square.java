package Loops.Patterns;

import java.util.Scanner;

public class Empty_Square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row");
    int n = sc.nextInt();

    System.out.println("Enter the column");
    int m = sc.nextInt();

    // Starting value or ending value is coming in the index of the border of the empty sqare.

    for(int i =1;i<=n;i++){
      for(int j = 1;j<=m;j++){
        if(i==1 || j ==1 || i==n || j==m ){
        System.out.print("*");
      }else{
        System.out.print(" ");
      }
      
    }
    System.out.println();
  }
}
}
