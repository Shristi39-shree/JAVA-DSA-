import java.util.*;
public class Indices {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number of rows and columns");
   int row = sc.nextInt();
   int col= sc.nextInt();
  
   int numbers[][] = new int[row][col];

  for(int i = 0;i<row;i++){
    for(int j = 0;j<col;j++){
      numbers[i][j] = sc.nextInt();
    }
  }

  for(int i = 0;i<row;i++){
    for(int j = 0;j<col;j++){
      System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
  }

  System.out.println("Enter the number to find its index ");
  int num = sc.nextInt();

  for(int i = 0;i<row;i++){
    for(int j = 0;j<col;j++){
      if(num == numbers[i][j]){
        System.out.println("The number is at the index: " + i + j);
      }
    }
  }
 } 
}
