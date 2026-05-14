import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = 0, b=1, c;
    
    System.out.println("Enter the number till which you want to print the serie: ");
    int n = sc.nextInt();
    System.out.println(a +"\n" +""+ b + " " );
    int f = 0;
    // 0 1 1 2 3 5 8 13 24 ....
    for(int i = 0; i<n;i++){

        c = a+b;
        System.out.println(c + " ");
        a = b;
        b = c;
       
       
    }
  }
}
