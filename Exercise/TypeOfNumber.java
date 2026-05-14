import java.util.*;
public class TypeOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int neg = 0;
    int pos = 0;
    int zero = 0;

    int choice;
    do{
      System.out.println("Enter a number:");
      int num =sc.nextInt();
      if(num>0){
        pos++;
      }
      else if(num<0){
        neg++;
      }
      else{
        zero++;
      }
     System.out.println("Press 1 to continue and 0 to stop:");
         choice = sc.nextInt();
    }while(choice == 1);

  System.out.println("Positive numbers = " + pos);
  
  System.out.println("Negative numbers = " + neg);

  System.out.println("Zero numbers = " + zero);
  }
}
