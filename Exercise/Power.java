import java.util.*;
public class Power {
  public static double PowerRaised(int x,int n){
   double p = Math.pow(x,n);
   System.out.println(p);
   return p;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x =sc.nextInt();
    int n = sc.nextInt();
    PowerRaised(x, n);

  }
}
