import java.util.*;
public class Factorial {
  public static void CalculateFact(int a){
    if(a<0){
      System.out.println("Invalid number");
      return;
    }
    else if(a==1){
      System.out.println("1");
      return;
    }
    else{
    int fac = 1;
    for(int i =a;i>=1;i--){
      fac = fac*i;
    }
    System.out.println(fac);
    return;
  }
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
  
    CalculateFact(a);
  
  }
}

