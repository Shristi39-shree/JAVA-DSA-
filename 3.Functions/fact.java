import java.util.*;
public class fact{
  public static int calculatefac(int n){
    int factorial = 1;
    if(n<0){
      System.out.println("Invalid number");
      return -1;
    }
   
    for(int i = 1;i<=n;i++){
      factorial = factorial*i;
       
    }
    return factorial;  
    
  }
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int factorial = calculatefac(n);
    if(factorial != -1){
    System.out.println("The factorial of a number is :"+ factorial);
    }
  }
}