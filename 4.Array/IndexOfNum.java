import java.util.Scanner;

public class IndexOfNum {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   
   System.out.println("Enter the size of the array");
   int size = sc.nextInt();

   int marks [] = new int[size];
   for(int i=0;i<size;i++){
    marks[i] = sc.nextInt();
   }
  
   System.out.print("Enter the number to find its index: ");
   int num = sc.nextInt();
   
   for(int j = 0;j<marks.length;j++){
    if (num == marks[j]){
      System.out.println("The number is at the index: " + j);
    }
   }
   
  }
}

