package Loops.Patterns;

import java.util.Scanner;

public class Inverse_numTriangle {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int n = sc.nextInt();
    
    //outer loop 
    for(int i=n;i>=1;i--){
      //inner loop
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
}

}
