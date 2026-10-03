class Student{
  int roll;
}
class admission extends Student{
  String name;
  int addno;
}


public class Inherit {
  public static void main(String args[]){
    admission a1 = new admission();
    a1.roll=20;
    a1.name = "Shree";
    a1.addno=4567;
    
  }
}
