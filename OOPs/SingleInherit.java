class Shape{
 public void area(){
  System.out.println("Display area");
 }
}
class Triangle extends Shape{
 public void area(int h,int b){
  System.out.println("1/2*b*h");
 }
} 


public class SingleInherit {
  public static void main(String args[]){
   Triangle t = new Triangle();
   t.area(2,10); 
  }
  
}
