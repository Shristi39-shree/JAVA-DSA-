import java.util.*;
public class TwoDArray {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();
    System.out.println("Enter the number of columns");
    int cols = sc.nextInt();
     
    int [][] numbers = new int[rows][cols];
    
    System.out.println("Enter the values in 2D arrays");
    for(int i = 0;i<rows;i++){
      for(int j = 0;j<cols;j++){
        numbers[i][j] = sc.nextInt();
      }
    }
    for(int i = 0;i<rows;i++){
      for(int j = 0;j<cols;j++){
        System.out.print(numbers[i][j] + " ");
      }
      System.err.println();
    }
  }
}
