package Loops;

import java.util.Scanner;

public class SumOf_naturalNum {
public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of n");
  int n = sc.nextInt();

    //Using for loop

  //   int sum = 0;
  // for(int i=1;i<=n;i++){
  //   sum = sum+i;
  // }
  // System.out.println("The sum of n natural numbers is :"+sum);

//Using do while loop
// int i =1;
// int sum = 0;
// do{
//   sum = sum+i;
//   i++;
// }while(i<=n);
// System.out.println("The sum of the numbers is :"+sum);
// }
// }

// using while loop
int sum = 0;
int i = 1;
while(i<=n){
  sum = sum+i;
  i++;
}
System.out.println("The sum of n natural numbers is :"+sum);
}
}