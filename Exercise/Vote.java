import java.util.*;

public class Vote {
  public static void Voter(int age){
    if( age>=18){
      System.out.println("Eligible to vote");
      return;
    }
    else{
      System.out.println("Not eligible to vote");
      return;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
  
    int n = sc.nextInt();
    Voter(n);
  }
}
