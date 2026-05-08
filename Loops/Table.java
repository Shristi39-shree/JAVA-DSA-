package Loops;

import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of the table ");
    int n = sc.nextInt();
   
    for(int i =1;i<11;i++){
     int  mul = i*n;
      System.err.println(n +"X"+ i +"=" + "=" + mul);
    }
  }
}
