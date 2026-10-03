class Student{
  int roll;
  String name;
  static  String school;

}


public class KeywordStatic {
  public static void main(String args[]){
    Student.school = "B.D.Academy";
    Student student1 = new Student();
    student1.roll = 340;
    student1.name = "SHree";
    System.out.println(Student.school);
  }
  
}
